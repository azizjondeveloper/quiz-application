package com.example.quizapplication.payload;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ErrorData {
    private String msg;

    private Integer code;

    private String fieldName;

    public ErrorData(String msg, Integer code) {
        this.msg = msg;
        this.code = code;
    }
}
