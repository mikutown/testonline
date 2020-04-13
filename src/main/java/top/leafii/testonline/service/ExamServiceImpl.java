package top.leafii.testonline.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.leafii.testonline.common.api.PagableResponse;
import top.leafii.testonline.common.api.PageRequest;
import top.leafii.testonline.common.domain.*;
import top.leafii.testonline.common.utils.RandomDistribution;
import top.leafii.testonline.mapper.*;

import java.util.List;

@Service
public class ExamServiceImpl implements ExamService{
    @Autowired
    ExamMapper examMapper;
    @Autowired
    ResultMapper resultMapper;
    @Autowired
    Ques_subMapper ques_subMapper;
    @Autowired
    QuestionMapper questionMapper;
    @Autowired
    Exam_quesMapper exam_quesMapper;
    @Override
    public PagableResponse<List<Exam>> list(PageRequest request) {
        //完成分页
        PageHelper.startPage(request.getPageNum(),request.getPageSize());
        List<Exam> exams = examMapper.selectByExample(new ExamExample());
        //System.out.println(new PageInfo<>(users).getTotal());//打印总数
        return new PagableResponse(new PageInfo<>(exams).getTotal(),exams);

    }

    @Override
    public Boolean insertExam(Exam exam,int uId) {
        //将考试信息examid和subid添加到exam表中
        int i = examMapper.insertSelective(exam);
        //添加examid和uid到result表格中
        int j = 0;
        Result result = new Result();
        if(i>0){
            result.setExamId(exam.getExamId());
            result.setuId(uId);
            j = resultMapper.insertSelective(result);
        }
        //添加result成功后分配题目
        if(j>0){
            //获取所有题目
            Ques_subExample ques_subExample = new Ques_subExample();
            ques_subExample.or().andSubIdEqualTo(exam.getSubId());
            List<Ques_sub> ques_subs = ques_subMapper.selectByExample(ques_subExample);
            //获取quesId的数组
            int[] quesIds = new int[ques_subs.size()];
            int count = 0;
            for (Ques_sub ques_sub : ques_subs) {
                quesIds[count] = ques_sub.getQuesId();
                count++;
            }
            //新建ExamQuesExample对象
            Exam_quesExample exam_quesExample = new Exam_quesExample();
            //随机分配从0到quesId的size的题目数组
            int[] ints = RandomDistribution.randomDistribution(quesIds, 20);
            for (int anInt : ints) {
                Exam_ques eq = new Exam_ques();
                eq.setQuesId(anInt);
                eq.setExamId(exam.getExamId());
                exam_quesMapper.insert(eq);
            }
        }
        return j>0?true:false;
    }
}
