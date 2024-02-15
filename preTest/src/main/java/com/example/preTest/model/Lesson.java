package com.example.preTest.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "lesson", catalog = "pretest")
public class Lesson extends BaseEntity {
    @Basic
    @Column(name = "name")
    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "score", cascade = CascadeType.ALL)
    private List<Score> scoreList;

}
