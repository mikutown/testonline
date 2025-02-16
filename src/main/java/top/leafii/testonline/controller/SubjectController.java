package top.leafii.testonline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import top.leafii.testonline.common.api.PagableResponse;
import top.leafii.testonline.common.api.PageRequest;
import top.leafii.testonline.common.domain.Subject;
import top.leafii.testonline.common.domain.User;
import top.leafii.testonline.common.utils.ItemBankManageMessage;
import top.leafii.testonline.common.utils.JSONMap;
import top.leafii.testonline.common.utils.UserManageMessage;
import top.leafii.testonline.service.SubjectService;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/subject")
public class SubjectController {
    @Autowired
    private SubjectService subjectService;
    @RequestMapping("/getsubjectbyexamid")
    @ResponseBody
    public Subject getSubjectByExamid(@RequestParam("examid")int examid){
        return subjectService.getSubjectByExamid(examid);
    }
    /**
     * 通过uid获取subject列表
     * @param request
     * @param uId
     * @return
     */
    @RequestMapping("/listbyuid")
    @ResponseBody
    public PagableResponse<List<Subject>> subjectListByUid(PageRequest request,@RequestParam("uId")int uId){
        return subjectService.listByUid(request,uId);
    }

    /**
     * 删除subject
     * @param subId
     * @return
     */
    @RequestMapping("/remove")
    @ResponseBody
    public Object removeSubject(@RequestParam("subId")int subId){
        Subject sbInDB = subjectService.findSubjectByid(subId);
        Boolean removeSueecss = subjectService.removeSubject(sbInDB);
        if(removeSueecss){
            return new JSONMap(true,200, "删除科目："+sbInDB.getSubname()+"成功！");
        }else{
            return new JSONMap(false,200, "删除科目："+sbInDB.getSubname()+"失败！");
        }
    }
    /**
     * 修改科目
     * @param subject
     * @return
     */
    @PostMapping("/modify")
    @ResponseBody
    public Object modifySubject(@RequestBody Subject subject){
        subject.setSubtime(new Date());
        Boolean bool = subjectService.modifySubject(subject);
        if(bool){
            return new JSONMap(true,200, ItemBankManageMessage.SUBJECT_MODIFY_SUCCESS);
        }else{
            return new JSONMap(false,200, ItemBankManageMessage.SUBJECT_MODIFY_ERROR);
        }
    }
    /**
     * 通过id获取subject
     * @param id
     * @return subject
     */
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

    /**
     * 添加科目
     * @param subject
     * @return
     */
    @RequestMapping("/save")
    @ResponseBody
    public Object saveSubject(@RequestBody Subject subject){
        subject.setSubtime(new Date());
        Boolean bool = subjectService.saveSubject(subject);
        if(bool){
            return new JSONMap(true,200, ItemBankManageMessage.SUBJECT_ADD_SUCCESS);
        }
        else{
            return new JSONMap(false,200, ItemBankManageMessage.SUBJECT_ADD_ERROR);
        }
    }

}
