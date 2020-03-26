package top.leafii.testonline.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import top.leafii.testonline.common.domain.User_sub;
import top.leafii.testonline.common.domain.User_subExample;
@Repository
public interface User_subMapper {
    long countByExample(User_subExample example);

    int deleteByExample(User_subExample example);

    int insert(User_sub record);

    int insertSelective(User_sub record);

    List<User_sub> selectByExample(User_subExample example);

    int updateByExampleSelective(@Param("record") User_sub record, @Param("example") User_subExample example);

    int updateByExample(@Param("record") User_sub record, @Param("example") User_subExample example);
}