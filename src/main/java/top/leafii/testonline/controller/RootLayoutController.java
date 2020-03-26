package top.leafii.testonline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RootLayoutController {
    @GetMapping("/page/back")
    public String toBack(){
        return "/views/usermanage/backhome";
    }
    @GetMapping("/page/problist")
    public String toProbList(){
        return "/views/problemmanage/problist";
    }
    @GetMapping("/page/sublist")
    public String toSubList(){
        return "/views/problemmanage/sublist";
    }
    @GetMapping("/page/typelist")
    public String toTypeList(){
        return "/views/problemmanage/typelist";
    }

    @GetMapping("/page/paperlist")
    public String toPaperList(){
        return "/views/resultmanage/paperlist";
    }
    @GetMapping("/page/rslist")
    public String toRsList(){
        return "/views/resultmanage/rslist";
    }
    @GetMapping("/page/userlist")
    public String toUserList(){
        return "/views/usermanage/userlist";
    }
    @GetMapping("/page/usersublist")
    public String toUserSubList(){
        return "/views/usermanage/usersublist";
    }

}
