package com.example.preTest.service;

import com.example.preTest.dao.LessonDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LessonService {
    private final LessonDao lessonDao;
}
