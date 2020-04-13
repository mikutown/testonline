package top.leafii.testonline.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import top.leafii.testonline.common.domain.Exam_ques;
import top.leafii.testonline.common.domain.Exam_quesExample;
@Repository
public interface Exam_quesMapper {
    long countByExample(Exam_quesExample example);

    int deleteByExample(Exam_quesExample example);

    int insert(Exam_ques record);

    int insertSelective(Exam_ques record);

    List<Exam_ques> selectByExample(Exam_quesExample example);

    int updateByExampleSelective(@Param("record") Exam_ques record, @Param("example") Exam_quesExample example);

    int updateByExample(@Param("record") Exam_ques record, @Param("example") Exam_quesExample example);
}