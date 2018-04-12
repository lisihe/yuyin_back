package me.runfang.yuyin.yuyinback.dao;

import java.util.List;
import me.runfang.yuyin.yuyinback.domain.core.YyMusicsheet;
import me.runfang.yuyin.yuyinback.domain.core.YyMusicsheetExample;
import org.apache.ibatis.annotations.Param;

public interface YyMusicsheetMapper {
    long countByExample(YyMusicsheetExample example);

    int deleteByExample(YyMusicsheetExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YyMusicsheet record);

    int insertSelective(YyMusicsheet record);

    List<YyMusicsheet> selectByExample(YyMusicsheetExample example);

    YyMusicsheet selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YyMusicsheet record, @Param("example") YyMusicsheetExample example);

    int updateByExample(@Param("record") YyMusicsheet record, @Param("example") YyMusicsheetExample example);

    int updateByPrimaryKeySelective(YyMusicsheet record);

    int updateByPrimaryKey(YyMusicsheet record);
}