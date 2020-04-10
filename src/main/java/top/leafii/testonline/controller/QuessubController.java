package top.leafii.testonline.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import top.leafii.testonline.common.domain.Ques_sub;
import top.leafii.testonline.common.domain.Subject;
import top.leafii.testonline.common.utils.ItemBankManageMessage;
import top.leafii.testonline.common.utils.JSONMap;
import top.leafii.testonline.common.utils.UserManageMessage;
import top.leafii.testonline.service.Ques_subService;

import java.util.List;

@Controller
@RequestMapping("/ques_sub")
public class QuessubController {
    @Autowired
    Ques_subService ques_subService;
    @RequestMapping("/remove")
    @ResponseBody
    public Object removeQuestionSubject(@RequestBody Ques_sub ques_sub){
        Boolean bool = ques_subService.removeQuestionSubject(ques_sub);
        if(bool){
            return new JSONMap(true,200, ItemBankManageMessage.QUESTION_SUB_REMOVE_SUCCESS);
        }else{
            return new JSONMap(false,200, ItemBankManageMessage.QUESTION_SUB_REMOVE_ERROR);
        }
    }
    /**
     * 为指定问题添加科目
     * @param ques_sub
     * @return
     */
    @RequestMapping("/add")
    @ResponseBody
    public Object addQuestionSubject(@RequestBody Ques_sub ques_sub){
        Boolean bool = ques_subService.addQuestionSubject(ques_sub);
        if(bool){
            return new JSONMap(true,200, ItemBankManageMessage.QUESTION_SUB_ADD_SUCCESS);
        }else{
            return new JSONMap(false,200, ItemBankManageMessage.QUESTION_SUB_ADD_ERROR);
        }
    }
    @RequestMapping("/getnoquestionsubject")
    @ResponseBody
    public Object getNoQuestionSubject(@RequestParam("quesId") int quesId){
        List<Subject> list = ques_subService.getNoQuestionSubject(quesId);
        return list;
    }
    @RequestMapping("/getusersubject")
    @ResponseBody
    public Object getQuestionSubject(@RequestParam("quesId") int quesId){
        List<Subject> list = ques_subService.getQuestionSubject(quesId);
        return list;
    }
}
