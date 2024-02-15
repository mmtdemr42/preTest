package com.example.preTest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ScoreDto extends BaseDto{
    private Integer id;
    private Integer score;
    private Integer createdById;
    private StudentDto student;

}
