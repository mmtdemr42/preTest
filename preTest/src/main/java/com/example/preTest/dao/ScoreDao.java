package com.example.preTest.dao;

import com.example.preTest.model.Score;
import org.springframework.data.repository.CrudRepository;

public interface ScoreDao extends CrudRepository<Score, Integer> {
}
