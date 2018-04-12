package me.runfang.yuyin.yuyinback.dao;

import java.util.List;
import me.runfang.yuyin.yuyinback.domain.core.YyMusicRemark;
import me.runfang.yuyin.yuyinback.domain.core.YyMusicRemarkExample;
import org.apache.ibatis.annotations.Param;

public interface YyMusicRemarkMapper {
    long countByExample(YyMusicRemarkExample example);

    int deleteByExample(YyMusicRemarkExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YyMusicRemark record);

    int insertSelective(YyMusicRemark record);

    List<YyMusicRemark> selectByExampleWithBLOBs(YyMusicRemarkExample example);

    List<YyMusicRemark> selectByExample(YyMusicRemarkExample example);

    YyMusicRemark selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YyMusicRemark record, @Param("example") YyMusicRemarkExample example);

    int updateByExampleWithBLOBs(@Param("record") YyMusicRemark record, @Param("example") YyMusicRemarkExample example);

    int updateByExample(@Param("record") YyMusicRemark record, @Param("example") YyMusicRemarkExample example);

    int updateByPrimaryKeySelective(YyMusicRemark record);

    int updateByPrimaryKeyWithBLOBs(YyMusicRemark record);

    int updateByPrimaryKey(YyMusicRemark record);
}