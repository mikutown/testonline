package top.leafii.testonline.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.leafii.testonline.common.api.PagableResponse;
import top.leafii.testonline.common.api.PageRequest;
import top.leafii.testonline.common.domain.Subject;
import top.leafii.testonline.common.domain.SubjectExample;
import top.leafii.testonline.mapper.SubjectMapper;

import java.util.List;
@Service
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    SubjectMapper subjectMapper;


    @Override
    public PagableResponse list(PageRequest request) {
        PageHelper.startPage(request.getPageNum(),request.getPageSize());
        List<Subject> subjects = subjectMapper.selectByExample(new SubjectExample());
        return new PagableResponse(new PageInfo<>(subjects).getTotal(),subjects);

    }

    @Override
    public Boolean checkSubName(String subname) {
        SubjectExample subjectExample = new SubjectExample();
        subjectExample.or().andSubnameEqualTo(subname);
        List<Subject> subjects = subjectMapper.selectByExample(subjectExample);
        System.out.println(subjects.size());
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
        return i>0?true:false;
    }
}
