package top.leafii.testonline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import top.leafii.testonline.common.api.PagableResponse;
import top.leafii.testonline.common.api.PageRequest;
import top.leafii.testonline.common.domain.Exam;
import top.leafii.testonline.common.domain.Result;
import top.leafii.testonline.common.domain.User;
import top.leafii.testonline.common.utils.ExamManageMessage;
import top.leafii.testonline.common.utils.ItemBankManageMessage;
import top.leafii.testonline.common.utils.JSONMap;
import top.leafii.testonline.mapper.User_subMapper;
import top.leafii.testonline.service.ExamService;
import top.leafii.testonline.service.ResultService;
import top.leafii.testonline.service.User_subService;

import java.util.List;

@Controller
@RequestMapping("/result")
public class ResultController {
    @Autowired
    ResultService resultService;
    User_subService user_subService;
    @RequestMapping("/addresult")
    @ResponseBody
    public Object addResult(@RequestParam("uId")int uId,@RequestParam("subId")int subId,@RequestParam("score")double score){
        //System.out.println("uID:"+uId+" subId："+subId+" score:"+score);
        Result rs = resultService.selectResultByUidSubid(uId,subId);
        Boolean bool = false;
        if(rs!=null){
            bool = resultService.insertScore(uId,subId,rs,score);
        }
        if(bool){
            return new JSONMap(true,200, ExamManageMessage.RESULT_ADD_SUCCESS);
        }
        else{
            return new JSONMap(false,200, ExamManageMessage.RESULT_ADD_ERROR);
        }
    }

    @RequestMapping("/list")
    @ResponseBody
    public PagableResponse<List<Result>> resultList(PageRequest request){
        return resultService.list(request);
    }
    @RequestMapping("/listbyuid")
    @ResponseBody
    public PagableResponse<List<Result>> resultList(PageRequest request, @RequestParam("uid")int uid){
        return resultService.listbyuid(request,uid);
    }

}
