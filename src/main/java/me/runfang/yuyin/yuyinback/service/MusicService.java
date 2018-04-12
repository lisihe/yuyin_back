package me.runfang.yuyin.yuyinback.service;

import me.runfang.yuyin.yuyinback.domain.core.YyMusicExample;
import me.runfang.yuyin.yuyinback.domain.dto.MusicDto;

import java.util.List;

/**
 * 音乐服务接口
 */
public interface MusicService {

    List<MusicDto> selectMusicList(YyMusicExample example);
}
