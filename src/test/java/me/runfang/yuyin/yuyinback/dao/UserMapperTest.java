package me.runfang.yuyin.yuyinback.dao;

import me.runfang.yuyin.yuyinback.domain.core.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;
    // 回归测试
    public void regressionTest() {


    }

    // 测试插入用户
    @Test
    @Rollback
    public void testInsertUser() {
        User user = new User();
        user.setUsername("banary123456");
        user.setPassword("123456");
        user.setNickname("banary");
        userMapper.insertUser(user);
        User u = userMapper.selectUserByUsername("banary123456");
        Assert.assertEquals("banary", u.getNickname());
    }

    // 测试根据用户名查询一个用户
    @Test
    public void testSelectUserByUsername() {
        User user = userMapper.selectUserByUsername("mike123456");
        Assert.assertEquals("mike", user.getNickname());
    }
    // 测试根据id查询用户
    @Test
    public void testSelectUserById() {
        User user = userMapper.selectUserById(6);
        Assert.assertEquals("tiny123456", user.getUsername());
    }

    // 测试更新用户
    @Test
    public void testUpdateUser() {
        User user = userMapper.selectUserByUsername("banary123456");
        user.setUsername("banary000");
        user.setPassword("111111");
        user.setNickname("banarymore");
        userMapper.updateUser(user);
        Assert.assertEquals("banary000", user.getUsername());
    }

    // 测试删除用户
    @Test
    public void testDeleteUserById() {
        int count = userMapper.countAllUser();
        userMapper.deleteUser(8);
        Assert.assertEquals(count - 1, userMapper.countAllUser());
    }

    // 测试按条件查询用户总数
    @Test
    public void testCountUserByModel() {
        User user = new User();
        user.setUsername("tiny123456");
        user.setNickname("tiny");
        Assert.assertEquals(1, userMapper.countUserByModel(user));
    }

}
