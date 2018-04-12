package me.runfang.yuyin.yuyinback.dao;

import java.util.List;
import me.runfang.yuyin.yuyinback.domain.core.YyLyrics;
import me.runfang.yuyin.yuyinback.domain.core.YyLyricsExample;
import org.apache.ibatis.annotations.Param;

public interface YyLyricsMapper {
    long countByExample(YyLyricsExample example);

    int deleteByExample(YyLyricsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YyLyrics record);

    int insertSelective(YyLyrics record);

    List<YyLyrics> selectByExample(YyLyricsExample example);

    YyLyrics selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YyLyrics record, @Param("example") YyLyricsExample example);

    int updateByExample(@Param("record") YyLyrics record, @Param("example") YyLyricsExample example);

    int updateByPrimaryKeySelective(YyLyrics record);

    int updateByPrimaryKey(YyLyrics record);
}