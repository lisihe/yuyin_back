package me.runfang.yuyin.yuyinback.dao;

import java.util.List;
import me.runfang.yuyin.yuyinback.domain.core.YySingerMusic;
import me.runfang.yuyin.yuyinback.domain.core.YySingerMusicExample;
import org.apache.ibatis.annotations.Param;

public interface YySingerMusicMapper {
    long countByExample(YySingerMusicExample example);

    int deleteByExample(YySingerMusicExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YySingerMusic record);

    int insertSelective(YySingerMusic record);

    List<YySingerMusic> selectByExample(YySingerMusicExample example);

    YySingerMusic selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YySingerMusic record, @Param("example") YySingerMusicExample example);

    int updateByExample(@Param("record") YySingerMusic record, @Param("example") YySingerMusicExample example);

    int updateByPrimaryKeySelective(YySingerMusic record);

    int updateByPrimaryKey(YySingerMusic record);
}