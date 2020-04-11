package top.leafii.testonline.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import top.leafii.testonline.common.domain.Subject;
import top.leafii.testonline.common.domain.User_sub;
import top.leafii.testonline.common.utils.JSONMap;
import top.leafii.testonline.common.utils.UserManageMessage;

import top.leafii.testonline.service.UserSubjectService;

import java.util.List;

@Controller
@RequestMapping("/user_sub")
public class UserSubjectController {
    @Autowired
    UserSubjectService userSubjectService;
    @RequestMapping("/getstatus")
    @ResponseBody
    public Object getstatus(@RequestParam("uid")int uid,@RequestParam("subid")int subid){
        User_sub uss = userSubjectService.getstatus(uid,subid);
        return uss;
    }
    /**
     * 移除已分配
     * @param userSub
     * @return
     */
    @RequestMapping("/remove")
    @ResponseBody
    public Object removeUserSubject(@RequestBody User_sub userSub){
        Boolean bool = userSubjectService.removeUserSubject(userSub);
        if(bool){
            return new JSONMap(true,200, UserManageMessage.USER_SUBJECT_REMOVE_SUCCESS);
        }else{
            return new JSONMap(false,200, UserManageMessage.USER_SUBJECT_REMOVE_ERROR);
        }
    }
    /**
     * 为用户分配科目
     * @param userSub
     * @return
     */
    @RequestMapping("/add")
    @ResponseBody
    public Object addUserSubject(@RequestBody User_sub userSub){
        //设定科目未被考试的状态码
        userSub.setStatus(0);
        Boolean bool = userSubjectService.addUserSubject(userSub);
        if(bool){
            return new JSONMap(true,200, UserManageMessage.USER_SUBJECT_ADD_SUCCESS);
        }else{
            return new JSONMap(false,200, UserManageMessage.USER_SUBJECT_ADD_ERROR);
        }
    }
    /**
     * 通过用户id获取没有被安排的科目
     * @param uid
     * @return
     */
    @RequestMapping("/getnousersubject")
    @ResponseBody
    public Object getNoUserSubject(@RequestParam("uid") int uid){
        List<Subject> list = userSubjectService.getNoUserSubject(uid);
        return list;
    }

    /**
     * 通过用户id获取已经被安排了的科目
     * @param uid
     * @return
     */
    @RequestMapping("/getusersubject")
    @ResponseBody
    public Object getUserSubject(@RequestParam("uid") int uid){
        List<Subject> list = userSubjectService.getUserSubject(uid);
        return list;
    }
}
