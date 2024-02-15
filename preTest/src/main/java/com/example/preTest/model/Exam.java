package com.example.preTest.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "exam", catalog = "pretest")
@Entity
public class Exam extends BaseEntity {
    @Basic
    @Column(name = "result")
    private String result;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "score", cascade = CascadeType.ALL)
    private List<Score> scoreList;
}
