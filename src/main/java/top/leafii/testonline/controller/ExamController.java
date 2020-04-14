package top.leafii.testonline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import top.leafii.testonline.common.api.PagableResponse;
import top.leafii.testonline.common.api.PageRequest;
import top.leafii.testonline.common.domain.Exam;
import top.leafii.testonline.common.domain.Question;
import top.leafii.testonline.common.domain.User;
import top.leafii.testonline.common.utils.ExamManageMessage;
import top.leafii.testonline.common.utils.JSONMap;
import top.leafii.testonline.common.utils.MD5;
import top.leafii.testonline.common.utils.UserManageMessage;
import top.leafii.testonline.mapper.Exam_quesMapper;
import top.leafii.testonline.service.ExamService;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/exam")
public class ExamController {
    @Autowired
    ExamService examService;

    @RequestMapping("/removeAll")
    @ResponseBody
    public Object removeExam(@RequestParam("subId") int subId, @RequestParam("uId") int uId) {
        Boolean bool = examService.removeAll(subId, uId);
        if (bool) {
            return new JSONMap(true, 200, ExamManageMessage.REMOVE_EXAM_SUCCESS);
        } else {
            return new JSONMap(false, 200, ExamManageMessage.REMOVE_EXAM_ERROR);
        }
    }

    @RequestMapping("/listQues")
    @ResponseBody
    public Object listQuestion(@RequestParam("subId")int subId,@RequestParam("uId")int uId){
        List<Question> questions = examService.listQuestion(subId,uId);
        System.out.println("开始啦");
        return questions;
    }

    /**
     * 添加exam相关的参数以及分配题目
     *
     * @param subId
     * @param uId
     * @return
     */
    @RequestMapping("/save")
    @ResponseBody
    public Object addExam(@RequestParam("subId") int subId, @RequestParam("uId") int uId) {
        Exam exam = new Exam(subId);
        int examid = (int) ((Math.random() * 9 + 1) * 100000000);
        exam.setExamId(examid);
        Boolean bool = examService.insertExam(exam, uId);

        if (bool) {
            return new JSONMap(true, 200, ExamManageMessage.ADD_EXAM_SUCCESS);
        } else {
            return new JSONMap(false, 200, ExamManageMessage.ADD_EXAM_ERROR);
        }
    }

    /**
     * 展示用户列表
     */
    @RequestMapping("/list")
    @ResponseBody
    public PagableResponse<List<Exam>> userList(PageRequest request) {
        return examService.list(request);
    }
}
