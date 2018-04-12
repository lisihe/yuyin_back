package me.runfang.yuyin.yuyinback.service.impl;

import me.runfang.yuyin.yuyinback.dao.YyLyricsMapper;
import me.runfang.yuyin.yuyinback.dao.YyMusicMapper;
import me.runfang.yuyin.yuyinback.dao.YySingerMapper;
import me.runfang.yuyin.yuyinback.domain.core.YyMusic;
import me.runfang.yuyin.yuyinback.domain.core.YyMusicExample;
import me.runfang.yuyin.yuyinback.domain.dto.MusicDto;
import me.runfang.yuyin.yuyinback.service.MusicService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MusicServiceImpl implements MusicService{
    @Autowired
    private YyMusicMapper musicMapper;
    @Autowired
    private YyLyricsMapper lyricsMapper;
    @Autowired
    private YySingerMapper singerMapper;

    @Override
    public List<MusicDto> selectMusicList(YyMusicExample example) {
        List<YyMusic> yyMusicsList =  musicMapper.selectByExample(example);
        List<MusicDto> musicDtoList = new ArrayList<MusicDto>();
        for(YyMusic yymusic : yyMusicsList) {
            MusicDto musicDto = new MusicDto();
            BeanUtils.copyProperties(yymusic, musicDto);
            musicDto.setDuration(yymusic.getDuration() % 60 + ":" + (Integer)(yymusic.getDuration() / 60));
            musicDto.setSinger(singerMapper.selectByPrimaryKey(yymusic.getSinger()).getName());
            musicDtoList.add(musicDto);
        }
        return musicDtoList;
    }
}
