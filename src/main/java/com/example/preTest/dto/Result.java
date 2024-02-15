package com.example.preTest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Result {
    private boolean status;
    private String message;
    private Object data;

    public static Result success(String message) {
        return Result.builder().message(message).status(true).build();
    }

    public static Result success(String message, Object data) {
        return Result.builder().message(message).status(true).data(data).build();
    }

    public static Result error(String message) {
        return Result.builder().message(message).status(false).build();
    }

    public static Result error(String message, Object data) {
        return Result.builder().message(message).status(false).data(data).build();
    }
}
