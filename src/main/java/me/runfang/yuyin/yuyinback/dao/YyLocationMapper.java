package me.runfang.yuyin.yuyinback.dao;

import java.util.List;
import me.runfang.yuyin.yuyinback.domain.core.YyLocation;
import me.runfang.yuyin.yuyinback.domain.core.YyLocationExample;
import org.apache.ibatis.annotations.Param;

public interface YyLocationMapper {
    long countByExample(YyLocationExample example);

    int deleteByExample(YyLocationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YyLocation record);

    int insertSelective(YyLocation record);

    List<YyLocation> selectByExample(YyLocationExample example);

    YyLocation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YyLocation record, @Param("example") YyLocationExample example);

    int updateByExample(@Param("record") YyLocation record, @Param("example") YyLocationExample example);

    int updateByPrimaryKeySelective(YyLocation record);

    int updateByPrimaryKey(YyLocation record);
}