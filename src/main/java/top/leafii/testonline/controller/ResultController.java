package top.leafii.testonline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import top.leafii.testonline.common.api.PagableResponse;
import top.leafii.testonline.common.api.PageRequest;
import top.leafii.testonline.common.domain.Result;
import top.leafii.testonline.common.domain.User;
import top.leafii.testonline.service.ResultService;

import java.util.List;

@Controller
@RequestMapping("/result")
public class ResultController {
    @Autowired
    ResultService resultService;
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
