package com.spring.mongo.project.service;

import com.spring.mongo.project.enums.CollegeType;
import com.spring.mongo.project.model.Student;

public interface UniversityService {

    CollegeType getCollegeType();
    void validate(Student dto);
    void save(Student dto);
}
