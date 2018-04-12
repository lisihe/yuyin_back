package me.runfang.yuyin.yuyinback.dao;

import me.runfang.yuyin.yuyinback.domain.core.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /* 根据用户名查找用户*/
    @Select("select * from user where username = #{username}")
    public User selectUserByUsername(@Param("username")String username);

    /* 统计用户总数*/
    @Select("select count(*) from user")
    public int countAllUser();

    /* 按照条件统计用户总数*/
    public int countUserSelective(User user);
}