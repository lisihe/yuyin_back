package me.runfang.yuyin.yuyinback.dao;

import java.util.List;
import me.runfang.yuyin.yuyinback.domain.core.YyUser;
import me.runfang.yuyin.yuyinback.domain.core.YyUserExample;
import org.apache.ibatis.annotations.Param;

public interface YyUserMapper {
    long countByExample(YyUserExample example);

    int deleteByExample(YyUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YyUser record);

    int insertSelective(YyUser record);

    List<YyUser> selectByExample(YyUserExample example);

    YyUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YyUser record, @Param("example") YyUserExample example);

    int updateByExample(@Param("record") YyUser record, @Param("example") YyUserExample example);

    int updateByPrimaryKeySelective(YyUser record);

    int updateByPrimaryKey(YyUser record);
}