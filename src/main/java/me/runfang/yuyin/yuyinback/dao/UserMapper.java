package me.runfang.yuyin.yuyinback.dao;

import me.runfang.yuyin.yuyinback.domain.core.User;
import org.apache.ibatis.annotations.*;

/**
 * 用户表数据访问接口
 */
@Mapper
public interface UserMapper {
    /* 根据用户名查找用户*/
    @Select("select * from user where username = #{username}")
    public User selectUserByUsername(@Param("username")String username);

    /* 根据id查找用户*/
    @Select("select * from user where id = #{id}")
    public User selectUserById(@Param("id") int id);

    /* 插入用户*/
    @Insert("insert into user (username, password, nickname) values (#{username}, #{password}, #{nickname})")
    public int insertUser(User user);

    /* 更新用户*/
    @Update("update user set username = #{username}, password = #{password}, nickname = #{nickname} where id = #{id}")
    public int updateUser(User user);

    /* 删除用户*/
    @Delete("delete from user where id = #{id}")
    public int deleteUser(int id);

    /* 统计用户总数*/
    @Select("select count(*) from user")
    public int countAllUser();

    /* 按照条件统计用户总数*/
    public int countUserByModel(User user);
}
