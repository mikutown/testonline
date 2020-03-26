package top.leafii.testonline.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import top.leafii.testonline.common.domain.Subject;
import top.leafii.testonline.common.domain.SubjectExample;
@Repository
public interface SubjectMapper {
    long countByExample(SubjectExample example);

    int deleteByExample(SubjectExample example);

    int deleteByPrimaryKey(Integer subId);

    int insert(Subject record);

    int insertSelective(Subject record);

    List<Subject> selectByExample(SubjectExample example);

    Subject selectByPrimaryKey(Integer subId);

    int updateByExampleSelective(@Param("record") Subject record, @Param("example") SubjectExample example);

    int updateByExample(@Param("record") Subject record, @Param("example") SubjectExample example);

    int updateByPrimaryKeySelective(Subject record);

    int updateByPrimaryKey(Subject record);
}