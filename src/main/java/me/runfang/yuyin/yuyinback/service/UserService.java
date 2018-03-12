package me.runfang.yuyin.yuyinback.service;

import me.runfang.yuyin.yuyinback.domain.core.User;

/**
 * 用户服务接口
 */
public interface UserService {
    // 注册
    public boolean LoginUser(User user);

    // 判断用户名是否重复
    public boolean usernameRepeat(String username);

    // 判断昵称是否重复
    public boolean nicknameRepeat(String nickname);
}
