package me.runfang.yuyin.yuyinback.dao;

import java.util.List;
import me.runfang.yuyin.yuyinback.domain.core.YyMusicsheetMuisc;
import me.runfang.yuyin.yuyinback.domain.core.YyMusicsheetMuiscExample;
import org.apache.ibatis.annotations.Param;

public interface YyMusicsheetMuiscMapper {
    long countByExample(YyMusicsheetMuiscExample example);

    int deleteByExample(YyMusicsheetMuiscExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YyMusicsheetMuisc record);

    int insertSelective(YyMusicsheetMuisc record);

    List<YyMusicsheetMuisc> selectByExample(YyMusicsheetMuiscExample example);

    YyMusicsheetMuisc selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YyMusicsheetMuisc record, @Param("example") YyMusicsheetMuiscExample example);

    int updateByExample(@Param("record") YyMusicsheetMuisc record, @Param("example") YyMusicsheetMuiscExample example);

    int updateByPrimaryKeySelective(YyMusicsheetMuisc record);

    int updateByPrimaryKey(YyMusicsheetMuisc record);
}