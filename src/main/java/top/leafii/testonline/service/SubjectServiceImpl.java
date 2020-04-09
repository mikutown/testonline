package top.leafii.testonline.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.leafii.testonline.common.api.PagableResponse;
import top.leafii.testonline.common.api.PageRequest;
import top.leafii.testonline.common.domain.Ques_subExample;
import top.leafii.testonline.common.domain.Subject;
import top.leafii.testonline.common.domain.SubjectExample;
import top.leafii.testonline.common.domain.User_subExample;
import top.leafii.testonline.mapper.Ques_subMapper;
import top.leafii.testonline.mapper.SubjectMapper;
import top.leafii.testonline.mapper.User_subMapper;

import java.util.List;
@Service
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    SubjectMapper subjectMapper;
    @Autowired
    Ques_subMapper ques_subMapper;
    @Autowired
    User_subMapper user_subMapper;
    @Override
    public PagableResponse list(PageRequest request) {
        PageHelper.startPage(request.getPageNum(),request.getPageSize());
        List<Subject> subjects = subjectMapper.selectByExample(new SubjectExample());
        return new PagableResponse(new PageInfo<>(subjects).getTotal(),subjects);

    }

    @Override
    public PagableResponse<List<Subject>> listByUid(PageRequest request, int uId) {
        PageHelper.startPage(request.getPageNum(),request.getPageSize());
        List<Subject> subjects = subjectMapper.selectByUId(uId);
        return new PagableResponse(new PageInfo<>(subjects).getTotal(),subjects);
    }
    @Override
    public Boolean checkSubName(String subname) {
        SubjectExample subjectExample = new SubjectExample();
        subjectExample.or().andSubnameEqualTo(subname);
        List<Subject> subjects = subjectMapper.selectByExample(subjectExample);
       // System.out.println(subjects.size());
        return subjects.size()>0?false:true;
    }

    @Override
    public Boolean saveSubject(Subject subject) {
        int i = subjectMapper.insertSelective(subject);
        return i>0?true:false;
    }

    @Override
    public Subject findSubjectByid(int id) {
        Subject subject = subjectMapper.selectByPrimaryKey(id);
        return subject;
    }

    @Override
    public Boolean modifySubject(Subject subject) {
        int i = subjectMapper.updateByPrimaryKeySelective(subject);
        return i>0?true:false;
    }

    @Override
    public Boolean removeSubject(Subject sbInDB) {
        int i = subjectMapper.deleteByPrimaryKey(sbInDB.getSubId());
        Ques_subExample quesSubExample = new Ques_subExample();
        quesSubExample.or().andSubIdEqualTo(sbInDB.getSubId());
        ques_subMapper.deleteByExample(quesSubExample);
        User_subExample userSubExample = new User_subExample();
        userSubExample.or().andSubIdEqualTo(sbInDB.getSubId());
        user_subMapper.deleteByExample(userSubExample);
        return i>0?true:false;
    }


}
