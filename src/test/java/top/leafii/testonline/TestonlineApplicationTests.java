package top.leafii.testonline;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.leafii.testonline.common.domain.*;
import top.leafii.testonline.common.utils.RandomDistribution;
import top.leafii.testonline.controller.UserController;
import top.leafii.testonline.mapper.*;
import top.leafii.testonline.service.UserService;

import java.util.Date;
import java.util.List;

@SpringBootTest
class TestonlineApplicationTests {
    @Autowired
    Exam_quesMapper mapper;
    @Autowired
    Ques_subMapper ques_subMapper;
    @Test
    void contextLoads() {
        Ques_subExample ques_subExample = new Ques_subExample();
        ques_subExample.or().andSubIdEqualTo(1006);
        List<Ques_sub> ques_subs = ques_subMapper.selectByExample(ques_subExample);
        //获取quesId的数组
        int[] quesIds = new int[ques_subs.size()];
        int count = 0;
        for (Ques_sub ques_sub : ques_subs) {
            quesIds[count] = ques_sub.getQuesId();
            count++;
        }
        //随机分配从0到quesId的size的题目数组
        int[] ints = RandomDistribution.randomDistribution(quesIds, 20);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

}
