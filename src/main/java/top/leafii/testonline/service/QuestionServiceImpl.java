package top.leafii.testonline.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.leafii.testonline.common.api.PagableResponse;
import top.leafii.testonline.common.api.PageRequest;
import top.leafii.testonline.common.domain.Question;
import top.leafii.testonline.common.domain.QuestionExample;
import top.leafii.testonline.common.domain.User;
import top.leafii.testonline.common.domain.UserExample;
import top.leafii.testonline.mapper.QuestionMapper;

import java.util.List;

/**
 * @author leafii
 */
@Service
public class QuestionServiceImpl implements QuestionService{
    @Autowired
    QuestionMapper questionMapper;
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
}
