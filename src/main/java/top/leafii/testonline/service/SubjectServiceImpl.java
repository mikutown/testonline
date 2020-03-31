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
    public PagableResponse<List<Subject>> list(PageRequest request) {
        PageHelper.startPage(request.getPageNum(),request.getPageSize());
        List<Subject> subjects = subjectMapper.selectByExample(new SubjectExample());
        System.out.println(new PageInfo<>(subjects).getTotal());//打印总数
        return null;
    }
}
