package com.example.preTest.dao;

import com.example.preTest.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentDao extends CrudRepository<Student, Integer> {
}
