package com.example.preTest.dao;

import com.example.preTest.model.Lesson;
import org.springframework.data.repository.CrudRepository;

public interface LessonDao extends CrudRepository<Lesson, Integer> {
}
