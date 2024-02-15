package com.example.preTest.service;

import com.example.preTest.dao.ScoreDao;
import com.example.preTest.dto.ScoreDto;
import com.example.preTest.model.Score;
import lombok.RequiredArgsConstructor;
import org.apache.commons.collections4.IterableUtils;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ScoreService {
    private final ScoreDao scoreDao;
    private final ModelMapper modelMapper;

    public void save(ScoreDto scoreDto){
        Score score = modelMapper.map(scoreDto, Score.class );
        score.setCreateDate(new Date());
        scoreDao.save(score);
    }

    public void update(ScoreDto scoreDto){
        Score score = modelMapper.map(scoreDto, Score.class );
        score.setUpdateDate(new Date());
        scoreDao.save(score);
    }

    public List<ScoreDto> list(){
        List<Score> scoreList = IterableUtils.toList(scoreDao.findAll());
        return scoreList.stream().map(score -> modelMapper.map(score, ScoreDto.class)).collect(Collectors.toList());
    }

    public ScoreDto getScoreById(Integer id){
        Score score = scoreDao.findById(id).orElse(null);
        if (score == null)
            return null;

        return modelMapper.map(score, ScoreDto.class );
    }

    public Boolean delete(Integer id){
        Score score = scoreDao.findById(id).orElse(null);
        if (score == null)
            return true;

        scoreDao.delete(score);
        return false;
    }
}
