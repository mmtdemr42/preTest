package com.example.preTest.service;

import com.example.preTest.dao.TeacherDao;
import com.example.preTest.model.Teacher;
import lombok.RequiredArgsConstructor;
import org.apache.commons.collections4.IterableUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TeacherService {
    private final TeacherDao teacherDao;

    public List<Teacher> getTeachers(){
        return IterableUtils.toList(teacherDao.findAll());
    }

}
