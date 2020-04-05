package top.leafii.testonline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.leafii.testonline.common.api.PagableResponse;
import top.leafii.testonline.common.api.PageRequest;
import top.leafii.testonline.common.domain.Question;
import top.leafii.testonline.common.domain.User;
import top.leafii.testonline.service.QuestionService;

import java.util.List;

/**
 * @author leafii
 */
@Controller
@RequestMapping("/question")
public class QuestionController {
    final
    QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @RequestMapping("/list")
    @ResponseBody
    public PagableResponse<List<Question>> questionList(PageRequest request){
        return questionService.list(request);
    }


}
