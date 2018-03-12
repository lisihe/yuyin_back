package me.runfang.yuyin.yuyinback.service.impl;

import me.runfang.yuyin.yuyinback.dao.UserMapper;
import me.runfang.yuyin.yuyinback.domain.core.User;
import me.runfang.yuyin.yuyinback.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean LoginUser(User user) {
        // 判断用户名不能重复

        // 判断昵称不能重复
        return false;
    }

    @Override
    public boolean usernameRepeat(String username) {
        User user = new User();
        user.setUsername(username);
        int count = userMapper.countUserByModel(user);
        return count > 0 ? true : false;
    }

    @Override
    public boolean nicknameRepeat(String nickname) {
        User user = new User();
        user.setNickname(nickname);
        int count = userMapper.countUserByModel(user);
        return count > 0 ? true : false;
    }
}
