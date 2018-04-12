package me.runfang.yuyin.yuyinback.dao;

import java.util.List;
import me.runfang.yuyin.yuyinback.domain.core.YyMusic;
import me.runfang.yuyin.yuyinback.domain.core.YyMusicExample;
import org.apache.ibatis.annotations.Param;

public interface YyMusicMapper {
    long countByExample(YyMusicExample example);

    int deleteByExample(YyMusicExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YyMusic record);

    int insertSelective(YyMusic record);

    List<YyMusic> selectByExample(YyMusicExample example);

    YyMusic selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YyMusic record, @Param("example") YyMusicExample example);

    int updateByExample(@Param("record") YyMusic record, @Param("example") YyMusicExample example);

    int updateByPrimaryKeySelective(YyMusic record);

    int updateByPrimaryKey(YyMusic record);
}