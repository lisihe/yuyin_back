package me.runfang.yuyin.yuyinback.web.accessController;

import me.runfang.yuyin.yuyinback.domain.core.User;
import me.runfang.yuyin.yuyinback.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private UserService userService;
    /**
     * 注册
     */
    @PostMapping("/")
    public String loginUser(@RequestBody User user) {

        return "success";
    }

    /**
     * 测试用户名是否重复
     */
    @GetMapping("/usernameRepeat")
    public boolean usernameRepeat(@RequestParam String username) {
        return userService.usernameRepeat(username);
    }

    /**
     * 测试昵称是否重复
     */
    @GetMapping("/nicknameRepeat")
    public boolean nicknameRepeat(@RequestParam String nickname) {
        return userService.nicknameRepeat(nickname);
    }
}
