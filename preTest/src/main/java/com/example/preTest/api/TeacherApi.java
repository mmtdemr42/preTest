package com.example.preTest.api;

import com.example.preTest.dto.Result;
import com.example.preTest.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pretest/teacher/")
@RequiredArgsConstructor
@CrossOrigin("http://localhost:8080")
public class TeacherApi {
    private final TeacherService teacherService;

    @GetMapping(value = "list")
    private @ResponseBody ResponseEntity<Result> uploadData(){
        return ResponseEntity.ok(Result.success("Başarılı bir şekilde öğretmenler listelendi!", teacherService.getTeachers()));
    }
}
