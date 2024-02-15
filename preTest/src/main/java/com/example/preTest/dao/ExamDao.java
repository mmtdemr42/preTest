package com.example.preTest.dao;

import com.example.preTest.model.Exam;
import org.springframework.data.repository.CrudRepository;

public interface ExamDao extends CrudRepository<Exam, Integer> {
}
