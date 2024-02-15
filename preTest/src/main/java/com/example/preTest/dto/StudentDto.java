package com.example.preTest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto extends BaseDto {
    private String name;
    private String surname;
    private String imageUrl;
    private Integer studentNo;
}
