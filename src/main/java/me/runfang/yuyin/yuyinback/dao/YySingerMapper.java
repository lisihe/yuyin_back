package me.runfang.yuyin.yuyinback.dao;

import java.util.List;
import me.runfang.yuyin.yuyinback.domain.core.YySinger;
import me.runfang.yuyin.yuyinback.domain.core.YySingerExample;
import org.apache.ibatis.annotations.Param;

public interface YySingerMapper {
    long countByExample(YySingerExample example);

    int deleteByExample(YySingerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YySinger record);

    int insertSelective(YySinger record);

    List<YySinger> selectByExample(YySingerExample example);

    YySinger selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YySinger record, @Param("example") YySingerExample example);

    int updateByExample(@Param("record") YySinger record, @Param("example") YySingerExample example);

    int updateByPrimaryKeySelective(YySinger record);

    int updateByPrimaryKey(YySinger record);
}