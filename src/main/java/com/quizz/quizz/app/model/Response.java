package com.quizz.quizz.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor

public class Response {
    private Integer id;
    private String response;
}
