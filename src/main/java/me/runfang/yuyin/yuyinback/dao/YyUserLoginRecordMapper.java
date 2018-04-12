package me.runfang.yuyin.yuyinback.dao;

import java.util.List;
import me.runfang.yuyin.yuyinback.domain.core.YyUserLoginRecord;
import me.runfang.yuyin.yuyinback.domain.core.YyUserLoginRecordExample;
import org.apache.ibatis.annotations.Param;

public interface YyUserLoginRecordMapper {
    long countByExample(YyUserLoginRecordExample example);

    int deleteByExample(YyUserLoginRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YyUserLoginRecord record);

    int insertSelective(YyUserLoginRecord record);

    List<YyUserLoginRecord> selectByExample(YyUserLoginRecordExample example);

    YyUserLoginRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YyUserLoginRecord record, @Param("example") YyUserLoginRecordExample example);

    int updateByExample(@Param("record") YyUserLoginRecord record, @Param("example") YyUserLoginRecordExample example);

    int updateByPrimaryKeySelective(YyUserLoginRecord record);

    int updateByPrimaryKey(YyUserLoginRecord record);
}