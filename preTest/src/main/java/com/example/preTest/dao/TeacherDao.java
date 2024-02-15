package com.example.preTest.dao;

import com.example.preTest.model.Teacher;
import org.springframework.data.repository.CrudRepository;

public interface TeacherDao extends CrudRepository<Teacher, Integer> {
}
