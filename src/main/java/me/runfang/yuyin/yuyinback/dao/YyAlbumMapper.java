package me.runfang.yuyin.yuyinback.dao;

import me.runfang.yuyin.yuyinback.domain.core.YyAlbum;
import me.runfang.yuyin.yuyinback.domain.core.YyAlbumExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface YyAlbumMapper {
    long countByExample(YyAlbumExample example);

    int deleteByExample(YyAlbumExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YyAlbum record);

    int insertSelective(YyAlbum record);

    List<YyAlbum> selectByExample(YyAlbumExample example);

    YyAlbum selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YyAlbum record, @Param("example") YyAlbumExample example);

    int updateByExample(@Param("record") YyAlbum record, @Param("example") YyAlbumExample example);

    int updateByPrimaryKeySelective(YyAlbum record);

    int updateByPrimaryKey(YyAlbum record);
}