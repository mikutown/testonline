package top.leafii.testonline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import top.leafii.testonline.common.api.PagableResponse;
import top.leafii.testonline.common.api.PageRequest;
import top.leafii.testonline.common.domain.Subject;
import top.leafii.testonline.common.domain.User;
import top.leafii.testonline.common.utils.ItemBankManageMessage;
import top.leafii.testonline.common.utils.JSONMap;
import top.leafii.testonline.common.utils.UserManageMessage;
import top.leafii.testonline.service.SubjectService;

import java.util.List;

@Controller
@RequestMapping("/subject")
public class SubjectController {
    @Autowired
    private SubjectService subjectService;
    @RequestMapping("/getsubjectbyid")
    @ResponseBody//ajax
    public Subject getSubjectById(@RequestParam("id") int id){
        Subject s= subjectService.findSubjectByid(id);
        return s;
    }
    /**
     * 展示所有科目
     * @param request
     * @return
     */
    @RequestMapping("/list")
    @ResponseBody
    public PagableResponse<List<Subject>> subjectList(PageRequest request){
        return subjectService.list(request);
    }

    /**
     * 检查是否重名
     * @param subname
     * @return
     */
    @RequestMapping("/check-subname")
    @ResponseBody
    public Boolean checkSubName(@RequestParam("subname") String subname){
        return subjectService.checkSubName(subname);
    }

    @RequestMapping("/save")
    @ResponseBody
    public Object saveSubject(@RequestBody Subject subject){
        Boolean bool = subjectService.saveSubject(subject);
        if(bool){
            return new JSONMap(true,200, ItemBankManageMessage.SUBJECT_ADD_SUCCESS);
        }
        else{
            return new JSONMap(false,200, ItemBankManageMessage.SUBJECT_ADD_ERROR);
        }
    }

}
