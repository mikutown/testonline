package top.leafii.testonline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ClientLayoutController {
    @GetMapping("/page/toregister")
    public String toRegister(){ return "/views/usermanage/registerpage"; }
    @GetMapping("/page/client")
    public String toClientHome(){
        return "/views/client/clienthome";
    }
    @GetMapping("/page/remques")
    public String toRemainQues(){
        return "/views/client/remainques";
    }
    @GetMapping("/page/scorescan")
    public String toScoreScan(){
        return "/views/client/scorescan";
    }

}
