package com.spring.mongo.project.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "students") // MongoDB collection
public class StudentEntity {

    @Id
    private String id;

    private String name;
    private int age;
    private String course;

}
