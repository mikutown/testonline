package top.leafii.testonline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import top.leafii.testonline.common.api.PagableResponse;
import top.leafii.testonline.common.api.PageRequest;
import top.leafii.testonline.common.domain.User;
import top.leafii.testonline.common.utils.JSONMap;
import top.leafii.testonline.common.utils.MD5;
import top.leafii.testonline.common.utils.UserManageMessage;
import top.leafii.testonline.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;



    @GetMapping("/getuserbyid")
    @ResponseBody//ajax
    public User getUserById(@RequestParam("id") int id){
        User u = userService.findUserByUid(id);
        return u;
    }
    //删除单个用户
    @GetMapping("/remove")
    @ResponseBody//ajax
    public Object removeUser(@RequestParam("uId") int uId){
        User userInDB = userService.findUserByUid(uId);
        Boolean removeSuccess = userService.removeUser(userInDB);
        if(removeSuccess){
            return new JSONMap(true,200, "删除用户："+userInDB.getUname()+"成功！");
        }else{
            return new JSONMap(false,200, "删除用户："+userInDB.getUname()+"失败！");
        }
    }
    //管理页面添加用户
    @RequestMapping("/save")
    @ResponseBody//ajax
    public Object addUser(@RequestBody User user){
        user.setRoleId(2);
        System.out.println(user);
        String newpwd = MD5.md5(user.getPassword()+user.getUname());
        user.setPassword(newpwd);
        System.out.println(user);
        Boolean bool = userService.insertUser(user);
        if(bool){
            return new JSONMap(true,200, UserManageMessage.USER_ADD_SUCCESS);
        }else{
            return new JSONMap(false,200, UserManageMessage.USER_ADD_ERROR);
        }
    }
    //展示用户列表
    @RequestMapping("/list")
    @ResponseBody
    public PagableResponse<List<User>> userList(PageRequest request){
        return userService.list(request);
    }
    @RequestMapping("/logout")
    @ResponseBody
    public Object logout(HttpServletRequest request){
        request.getSession().removeAttribute("user");
        return new JSONMap(true,200, UserManageMessage.LOGOUT_SUCCESS);
    }
    //注册
    @PostMapping("/register")
    @ResponseBody
    public Object register(@RequestBody User user){
        user.setRoleId(2);
        String newpwd = MD5.md5(user.getPassword()+user.getUname());
        user.setPassword(newpwd);
        Boolean bool = userService.insertUser(user);
        if(bool){
            return new JSONMap(true,200, UserManageMessage.REGISTER_SUCCESS);
        }else{
            return new JSONMap(false,200, UserManageMessage.REGISTER_ERROR);
        }
    }
    @PostMapping("/modify")
    @ResponseBody
    public Object modify(@RequestBody User user){
        user.setRoleId(2);
        String newpwd = MD5.md5(user.getPassword()+user.getUname());
        user.setPassword(newpwd);
        Boolean bool = userService.modifyUser(user);
        if(bool){
            return new JSONMap(true,200, UserManageMessage.MODIFY_SUCCESS);
        }else{
            return new JSONMap(false,200, UserManageMessage.MODIFY_ERROR);
        }
    }
    //登录
    @PostMapping("/login")
    @ResponseBody
    public Object login(@RequestBody User user, HttpServletRequest request) {
        HttpSession session = request.getSession();
        User userDB = userService.findUserByUname(user);
        String md5Pwd = MD5.md5(user.getPassword()+user.getUname());
        if (userDB == null) {
            return new JSONMap(false, 200, UserManageMessage.USER_IS_NOT_EXISTS);
        }
        if (userDB != null) {
            //判断密码不为空且数据库的密码与传入的密码相同
            if (userDB.getPassword() != null && user.getPassword() != null && userDB.getPassword().equals(md5Pwd)) {
                session.setAttribute("user",userDB);
                return new JSONMap(true, 200, UserManageMessage.SUCCESS,userDB);
            } else {
                //密码错误
                return new JSONMap(false, 200, UserManageMessage.PWD_ERROR);
            }
        }
        return new JSONMap(false, 200, UserManageMessage.UNKNOWN_ERROR);
    }
    //检查用户名是否已存在
    @GetMapping("/check-username")
    @ResponseBody
    public Boolean checkUname(@RequestParam("uname") String uname){
        return userService.checkUname(uname);
    }
    //前台验证验证码
    @GetMapping("/check-verifyCode")
    @ResponseBody
    public Boolean checkVerifyCode(@RequestParam("verifyCode") String verifyCode,HttpServletRequest request){
        String codeInSession = (String)request.getSession().getAttribute("verityCode");
        return verifyCode.equalsIgnoreCase(codeInSession);
    }

}
