package me.runfang.yuyin.yuyinback.dao;

import java.util.List;
import me.runfang.yuyin.yuyinback.domain.core.YyAlbumMusic;
import me.runfang.yuyin.yuyinback.domain.core.YyAlbumMusicExample;
import org.apache.ibatis.annotations.Param;

public interface YyAlbumMusicMapper {
    long countByExample(YyAlbumMusicExample example);

    int deleteByExample(YyAlbumMusicExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YyAlbumMusic record);

    int insertSelective(YyAlbumMusic record);

    List<YyAlbumMusic> selectByExample(YyAlbumMusicExample example);

    YyAlbumMusic selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YyAlbumMusic record, @Param("example") YyAlbumMusicExample example);

    int updateByExample(@Param("record") YyAlbumMusic record, @Param("example") YyAlbumMusicExample example);

    int updateByPrimaryKeySelective(YyAlbumMusic record);

    int updateByPrimaryKey(YyAlbumMusic record);
}