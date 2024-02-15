package com.example.preTest.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "student", catalog = "pretest", indexes  = {
        @Index(name = "idx_student_no", columnList = "studentNo")
})
public class Student extends BaseEntity {
    @Basic
    @Column(name = "name")
    private String name;

    @Basic
    @Column(name = "surname")
    private String surname;

    @Basic
    @Column(name = "student_no")
    private String studentNo;

    @Basic
    @Column(name = "image_url")
    private String imageUrl;

    @Basic
    @Column(name = "birth_date")
    private Date birthDate;

    @OneToMany(mappedBy = "student", cascade = CascadeType.REMOVE)
    private List<Score> scores;

}
