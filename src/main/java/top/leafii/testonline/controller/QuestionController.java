package top.leafii.testonline.controller;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.leafii.testonline.common.api.PagableResponse;
import top.leafii.testonline.common.api.PageRequest;
import top.leafii.testonline.common.domain.Question;
import top.leafii.testonline.common.domain.User;
import top.leafii.testonline.common.utils.ItemBankManageMessage;
import top.leafii.testonline.common.utils.JSONMap;
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

    @RequestMapping("/save")
    @ResponseBody
    public Object saveQuestion(@RequestBody Question question){
        System.out.println(question);
        Boolean bool = questionService.save(question);
        if(bool){
            return new JSONMap(true,200, ItemBankManageMessage.TYPE_ADD_SUCCESS);
        }
        else{
            return new JSONMap(false,200, ItemBankManageMessage.TYPE_ADD_ERROR);
        }
    }
    /**
     * 获取问题列表
     * @param request
     * @return
     */
    @RequestMapping("/list")
    @ResponseBody
    public PagableResponse<List<Question>> questionList(PageRequest request){
        return questionService.list(request);
    }


}
