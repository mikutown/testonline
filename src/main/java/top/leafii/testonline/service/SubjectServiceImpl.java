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
    public List<Subject> list() {
        List<Subject> subjects = subjectMapper.selectByExample(new SubjectExample());
        return subjects;
    }
}
