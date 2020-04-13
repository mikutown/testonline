package top.leafii.testonline;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.leafii.testonline.common.domain.Exam_ques;
import top.leafii.testonline.common.domain.Exam_quesExample;
import top.leafii.testonline.common.domain.Subject;
import top.leafii.testonline.common.domain.User;
import top.leafii.testonline.common.utils.RandomDistribution;
import top.leafii.testonline.controller.UserController;
import top.leafii.testonline.mapper.Exam_quesMapper;
import top.leafii.testonline.mapper.SubjectMapper;
import top.leafii.testonline.mapper.UserMapper;
import top.leafii.testonline.mapper.User_subMapper;
import top.leafii.testonline.service.UserService;

import java.util.Date;
import java.util.List;

@SpringBootTest
class TestonlineApplicationTests {
    @Autowired
    Exam_quesMapper mapper;

    @Test
    void contextLoads() {
        int[] quesId = new int[35];
        int[] ints = RandomDistribution.randomDistribution(quesId, 25);
        //System.out.println(ints.length);
    }

}
