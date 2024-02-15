package com.example.preTest.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "score", catalog = "pretest")
@Entity
public class Score extends BaseEntity {
    @Basic
    @Column(name = "score")
    private Integer score;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "exam_id")
    private Exam exam;


    @ManyToOne
    @JoinColumn(name = "lesson_id")
    private Lesson lesson;


    @Basic
    @Column(name = "create_by_id")
    private Integer createdById;



}
