package top.leafii.testonline;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.leafii.testonline.common.domain.User;
import top.leafii.testonline.controller.UserController;
import top.leafii.testonline.mapper.UserMapper;
import top.leafii.testonline.service.UserService;

import java.util.List;

@SpringBootTest
class TestonlineApplicationTests {
    @Autowired
    UserController userController;
    UserService userService;

    @Test
    void contextLoads() {
//        User u = new User();
//        u.setuId(181);
//        u.setUname("abcde");
//        u.setPassword("abcde");
//        Object modify = userController.modify(u);
//        System.out.println(modify);
    }

}
