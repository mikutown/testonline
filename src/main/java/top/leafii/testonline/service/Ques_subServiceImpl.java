package top.leafii.testonline.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.leafii.testonline.common.domain.Ques_sub;
import top.leafii.testonline.common.domain.Ques_subExample;
import top.leafii.testonline.common.domain.Subject;
import top.leafii.testonline.mapper.Ques_subMapper;

import java.util.List;

@Service
public class Ques_subServiceImpl implements Ques_subService {
    @Autowired
    Ques_subMapper ques_subMapper;
    @Override
    public List<Subject> getNoQuestionSubject(int quesId) {
        return ques_subMapper.selectNoQuestionSubject(quesId);
    }

    @Override
    public List<Subject> getQuestionSubject(int quesId) {
        return ques_subMapper.selectQuestionSubject(quesId);
    }

    @Override
    public Boolean addQuestionSubject(Ques_sub ques_sub) {
        int i = ques_subMapper.insertSelective(ques_sub);
        return i>0?true:false;
    }

    @Override
    public Boolean removeQuestionSubject(Ques_sub ques_sub) {
        Ques_subExample example = new Ques_subExample();
        example.or().andQuesIdEqualTo(ques_sub.getQuesId()).andSubIdEqualTo(ques_sub.getSubId());
        int i = ques_subMapper.deleteByExample(example);
        return i>0?true:false;
    }
}
