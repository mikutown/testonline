package top.leafii.testonline.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import top.leafii.testonline.common.domain.Ques_sub;
import top.leafii.testonline.common.domain.Ques_subExample;
@Repository
public interface Ques_subMapper {
    long countByExample(Ques_subExample example);

    int deleteByExample(Ques_subExample example);

    int insert(Ques_sub record);

    int insertSelective(Ques_sub record);

    List<Ques_sub> selectByExample(Ques_subExample example);

    int updateByExampleSelective(@Param("record") Ques_sub record, @Param("example") Ques_subExample example);

    int updateByExample(@Param("record") Ques_sub record, @Param("example") Ques_subExample example);
}