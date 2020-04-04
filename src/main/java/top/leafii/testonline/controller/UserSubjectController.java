package top.leafii.testonline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import top.leafii.testonline.common.domain.Subject;
import top.leafii.testonline.common.domain.User_sub;
import top.leafii.testonline.service.UserService;
import top.leafii.testonline.service.UserSubjectService;

import java.util.List;

@Controller
@RequestMapping("/user_sub")
public class UserSubjectController {
    @Autowired
    UserSubjectService userSubjectService;
    @RequestMapping("/getnousersubject")
    @ResponseBody
    public Object getNoUserSubject(@RequestParam("uid") int uid){
        List<Subject> list = userSubjectService.getNoUserSubject(uid);
        return list;
    }
}
