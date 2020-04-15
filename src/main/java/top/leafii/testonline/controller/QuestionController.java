package top.leafii.testonline.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import top.leafii.testonline.common.api.PagableResponse;
import top.leafii.testonline.common.api.PageRequest;
import top.leafii.testonline.common.domain.Exam_ques;
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

    @RequestMapping("getpicbyquesid")
    @ResponseBody
    public Question getpicbyquesid(@RequestParam("id")int quesId, ModelMap modelMap){
        Question question = questionService.getQuestionByQuesid(quesId);
        modelMap.addAttribute("question",question);
        return question;
    }
    /**
     * 按照科目列表得到题目
     * @param request
     * @param subId
     * @return
     */
    @RequestMapping("/listbysubid")
    @ResponseBody
    public PagableResponse<List<Question>> questionListBySubId(PageRequest request,@RequestParam("subId") int subId){
        return questionService.listBySubId(request,subId);
    }
    @RequestMapping("/listbyexamid")
    @ResponseBody
    public PagableResponse<List<Question>> questionListBySubIdExamId(PageRequest request, @RequestParam("examId") int examId ){
        return questionService.listByExamId(request,examId);
    }



    /**
     * 修改
     * @param question
     * @return
     */
    @RequestMapping("/modify")
    @ResponseBody
    public Object modifyQuestion(@RequestBody Question question){
        Boolean bool = questionService.modifyQuestion(question);
        if(bool){
            return new JSONMap(true,200, ItemBankManageMessage.QUESTION_MODIFY_SUCCESS);
        }
        else{
            return new JSONMap(false,200, ItemBankManageMessage.QUESTION_MODIFY_ERROR);
        }
    }
    /**
     * 获取指定id的question
     * @param quesId
     * @return
     */
    @RequestMapping("/getquestionbyid")
    @ResponseBody
    public Question getQuestionByQuesid(@RequestParam("id")int quesId){
        return questionService.getQuestionByQuesid(quesId);
    }
    /**
     * 获取指定id的question 无答案
     * @param quesId
     * @return
     */
    @RequestMapping("/getquestionbyidnoanswer")
    @ResponseBody
    public Question getQuestionByQuesidNoAnswer(@RequestParam("id")int quesId){
        return questionService.getQuestionByQuesidNoAnswer(quesId);
    }
    /**
     * 删除特定question
     * @param quesId
     * @return
     */
    @RequestMapping("/remove")
    @ResponseBody
    public Object removeQuestion(@RequestParam("quesId")int quesId){
        Boolean removeSuccess = questionService.removeQuestion(quesId);
        if(removeSuccess){
            return new JSONMap(true,200,ItemBankManageMessage.QUESTION_REMOVE_SUCCESS );
        }else{
            return new JSONMap(false,200, ItemBankManageMessage.QUESTION_REMOVE_ERROR);
        }
    }
    /**
     * 添加新问题
     * @param question
     * @return
     */
    @RequestMapping("/save")
    @ResponseBody
    public Object saveQuestion(@RequestBody Question question){
       // System.out.println(question);
        Boolean bool = questionService.save(question);
        if(bool){
            return new JSONMap(true,200, ItemBankManageMessage.QUESTION_ADD_SUCCESS);
        }
        else{
            return new JSONMap(false,200, ItemBankManageMessage.QUESTION_ADD_ERROR);
        }
    }
    @RequestMapping("/comparechosanswer")
    @ResponseBody
    public Object compareChosAnswer(@RequestParam("quesId")int quesId,@RequestParam("choanswer")int choanswer){
        Question question = new Question(quesId,choanswer);
        System.out.println(question);
        Boolean bool = questionService.compareChosAnswer(question);
        if(bool){
            return new JSONMap(true,200, ItemBankManageMessage.ANSWER_QUES_SUCCESS);
        }
        else{
            return new JSONMap(false,200, ItemBankManageMessage.ANSWER_QUES_ERROR);
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
