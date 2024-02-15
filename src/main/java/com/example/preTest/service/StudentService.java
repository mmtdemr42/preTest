package com.example.preTest.service;

import com.example.preTest.dao.StudentDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentDao studentDao;
}
