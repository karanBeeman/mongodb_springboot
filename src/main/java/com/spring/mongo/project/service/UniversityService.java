package com.spring.mongo.project.service;

import com.spring.mongo.project.model.Student;

public interface UniversityService {

    void validate(Student dto);
    void save(Student dto);
}
