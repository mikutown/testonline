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

import java.util.ArrayList;
import java.util.List;
//select exam_id from result where u_id = 2 and exam_id in (select exam_id from exam where sub_id = 1006)
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

    @Override
    public Boolean removeAll(int subId, int uId) {
        List<Result> results = resultMapper.selectBySubidUid(subId, uId);
        List<Exam> exams = new ArrayList<>();
        for (Result result : results) {
            Exam exam = examMapper.selectByPrimaryKey(result.getExamId());
            exams.add(exam);
        }
        for (Exam exam : exams) {
            int i = examMapper.deleteByPrimaryKey(exam.getExamId());
            Exam_quesExample exam_quesExample = new Exam_quesExample();
            exam_quesExample.or().andExamIdEqualTo(exam.getExamId());
            int j = exam_quesMapper.deleteByExample(exam_quesExample);
            ResultExample resultExample = new ResultExample();
            resultExample.or().andExamIdEqualTo(exam.getExamId()).andUIdEqualTo(uId);
            int k = resultMapper.deleteByExample(resultExample);
            if(!(i>0||j>0||k>0)){
               return false;
            }
        }
        return true;
    }
//haimeixie
    @Override
    public List<Question> listQuestion(int subId, int uId) {
        List<Result> results = resultMapper.selectBySubidUid(subId, uId);
        Integer examId = results.get(0).getExamId();
        Integer resId = results.get(0).getResId();
        Exam_quesExample exam_quesExample = new Exam_quesExample();
        exam_quesExample.or().andExamIdEqualTo(examId);
        List<Exam_ques> exam_ques = exam_quesMapper.selectByExample(exam_quesExample);
        int quesIds[] = new int[exam_ques.size()];
        int count = 0;
        for (Exam_ques exam_que : exam_ques) {
            quesIds[count] = exam_que.getQuesId();
            count++;
        }
        List<Question> questions = new ArrayList<>();
        for (int quesId : quesIds) {
            Question question = questionMapper.selectByPrimaryKey(quesId);
            questions.add(question);
        }
        return questions;
    }
}
