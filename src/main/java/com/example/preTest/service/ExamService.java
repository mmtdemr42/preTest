package com.example.preTest.service;

import com.example.preTest.dao.ExamDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExamService {
    private final ExamDao examDao;
}
