package top.leafii.testonline.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.leafii.testonline.common.api.PagableResponse;
import top.leafii.testonline.common.api.PageRequest;
import top.leafii.testonline.common.domain.*;
import top.leafii.testonline.mapper.Ques_subMapper;
import top.leafii.testonline.mapper.QuestionMapper;

import java.util.List;

/**
 * @author leafii
 */
@Service
public class QuestionServiceImpl implements QuestionService{
    @Autowired
    QuestionMapper questionMapper;
    @Autowired
    Ques_subMapper ques_subMapper;
    @Override
    public PagableResponse<List<Question>> list(PageRequest request) {
        //完成分页
        PageHelper.startPage(request.getPageNum(),request.getPageSize());
        List<Question> questions = questionMapper.selectByExample(new QuestionExample());
        //System.out.println(new PageInfo<>(users).getTotal());//打印总数
        return new PagableResponse(new PageInfo<>(questions).getTotal(),questions);
    }

    @Override
    public Boolean save(Question question) {
        int i = questionMapper.insertSelective(question);
        return i>0?true:false;
    }

    @Override
    public Boolean removeQuestion(int quesId) {
        int i = questionMapper.deleteByPrimaryKey(quesId);
        Ques_subExample ques_subExample = new Ques_subExample();
        ques_subExample.or().andQuesIdEqualTo(quesId);
        int j = ques_subMapper.deleteByExample(ques_subExample);
        return i==j&&i>0?true:false;
    }

    @Override
    public Question getQuestionByQuesid(int quesId) {
        Question question = questionMapper.selectByPrimaryKey(quesId);
        return question;
    }
}
