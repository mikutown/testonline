package top.leafii.testonline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.leafii.testonline.common.api.PagableResponse;
import top.leafii.testonline.common.api.PageRequest;
import top.leafii.testonline.common.domain.Exam;
import top.leafii.testonline.common.domain.User;
import top.leafii.testonline.service.ExamService;

import java.util.List;

@Controller
@RequestMapping("/exam")
public class ExamController {
    @Autowired
    ExamService examService;
    //展示用户列表
    @RequestMapping("/list")
    @ResponseBody
    public PagableResponse<List<Exam>> userList(PageRequest request){
        return examService.list(request);
    }
}
