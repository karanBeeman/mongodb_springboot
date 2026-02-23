package com.spring.mongo.project.impl;

import com.spring.mongo.project.entity.StudentEntity;
import com.spring.mongo.project.model.Student;
import com.spring.mongo.project.repository.StudentRepository;
import com.spring.mongo.project.service.UniversityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service("ANNA")
@RequiredArgsConstructor
public class AnnaUniversityImpl implements UniversityService {

    private final StudentRepository repo;

    @Override
    public void validate(Student dto) {
        if (dto.getAge() < 18) {
            throw new IllegalArgumentException("Student must be at least 18 years old");
        }
        if (dto.getName() == null || dto.getName().isEmpty()) {
            throw new IllegalArgumentException("Student name cannot be empty");
        }
        if (dto.getCourse() == null || dto.getCourse().isEmpty()) {
            throw new IllegalArgumentException("Student course cannot be empty");
        }
    }

    @Override
    public void save(Student dto) {
        StudentEntity entity = new StudentEntity(null, dto.getName(), dto.getAge(), dto.getCourse());
        repo.save(entity);
    }
}
