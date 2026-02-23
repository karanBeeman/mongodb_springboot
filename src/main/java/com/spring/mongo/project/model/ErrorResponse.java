package com.spring.mongo.project.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ErrorResponse {

    private String timestamp;

    private Integer status;

    private String message;

    private String path;

    private String code;

}
