package top.leafii.testonline.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.leafii.testonline.common.api.PagableResponse;
import top.leafii.testonline.common.api.PageRequest;
import top.leafii.testonline.common.domain.Exam;
import top.leafii.testonline.common.domain.ExamExample;
import top.leafii.testonline.common.domain.User;
import top.leafii.testonline.common.domain.UserExample;
import top.leafii.testonline.mapper.ExamMapper;

import java.util.List;

@Service
public class ExamServiceImpl implements ExamService{
    @Autowired
    ExamMapper examMapper;
    @Override
    public PagableResponse<List<Exam>> list(PageRequest request) {
        //完成分页
        PageHelper.startPage(request.getPageNum(),request.getPageSize());
        List<Exam> exams = examMapper.selectByExample(new ExamExample());
        //System.out.println(new PageInfo<>(users).getTotal());//打印总数
        return new PagableResponse(new PageInfo<>(exams).getTotal(),exams);

    }
}
