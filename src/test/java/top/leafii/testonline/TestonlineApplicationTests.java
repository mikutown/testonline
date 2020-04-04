package top.leafii.testonline;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.leafii.testonline.common.domain.Subject;
import top.leafii.testonline.common.domain.User;
import top.leafii.testonline.controller.UserController;
import top.leafii.testonline.mapper.SubjectMapper;
import top.leafii.testonline.mapper.UserMapper;
import top.leafii.testonline.mapper.User_subMapper;
import top.leafii.testonline.service.UserService;

import java.util.Date;
import java.util.List;

@SpringBootTest
class TestonlineApplicationTests {
    @Autowired
    User_subMapper mapper;

    @Test
    void contextLoads() {
        int i = 1;
        List<Subject> subjects = mapper.selectNoUserSubject(2);
        for (Subject subject : subjects) {
            System.out.print(subject.getSubname()+'\t');
            i++;
            while (i%6==0){
                System.out.println();
                i++;
            }
        }
    }

}
