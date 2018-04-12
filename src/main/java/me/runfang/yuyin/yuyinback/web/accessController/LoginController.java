package me.runfang.yuyin.yuyinback.web.accessController;

import me.runfang.yuyin.yuyinback.domain.core.User;
import me.runfang.yuyin.yuyinback.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/login")
public class LoginController {
    @Autowired
    private UserService userService;
    /**
     * 注册
     */
    @PostMapping("/")
    public String loginUser(@RequestBody User user) {
        boolean inserted = userService.loginUser(user);
        if(inserted) {
            return "success";
        } else {
            return "error";
        }
    }

    /**
     * 登录
     */
    @PostMapping("/submit")
    public String login(@RequestBody User user) {
        boolean ishave = userService.login(user);
        System.out.println("ishave" + ishave);
        if(ishave) {
            return user.getUsername();
        } else {
            return "error";
        }
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
