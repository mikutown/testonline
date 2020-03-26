package top.leafii.testonline;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.leafii.testonline.common.domain.User;
import top.leafii.testonline.mapper.UserMapper;
import top.leafii.testonline.service.UserService;

import java.util.List;

@SpringBootTest
class TestonlineApplicationTests {
    @Autowired
    UserService userService;

    @Test
    void contextLoads() {
        Boolean root = userService.checkUname("root1");
        System.out.println(root);
    }

}
