package me.runfang.yuyin.yuyinback.web.accessController;

import me.runfang.yuyin.yuyinback.domain.core.YyMusicExample;
import me.runfang.yuyin.yuyinback.domain.dto.MusicDto;
import me.runfang.yuyin.yuyinback.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/music")
public class MusicController {
    @Autowired
    private MusicService musicService;

    @PostMapping("/select")
    public List<MusicDto> select(String username) {
        YyMusicExample yyMusicExample = new YyMusicExample();
        return musicService.selectMusicList(yyMusicExample);
    }
}
