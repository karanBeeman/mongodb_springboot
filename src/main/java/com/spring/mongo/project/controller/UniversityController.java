package com.spring.mongo.project.controller;

import com.spring.mongo.project.enums.CollegeType;
import com.spring.mongo.project.factory.UniversityFactory;
import com.spring.mongo.project.impl.AnnaUniversityImpl;
import com.spring.mongo.project.model.Student;
import com.spring.mongo.project.service.UniversityService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UniversityController {

    private final UniversityFactory universityFactory;


    public UniversityController(UniversityFactory universityFactory) {
        this.universityFactory = universityFactory;
    }

    @PostMapping("/university/studentdetail")
    public void saveStudentDetail(@RequestParam CollegeType college, @RequestBody Student student) {
        UniversityService service = universityFactory.get(college);
        service.validate(student);
        service.save(student);
    }


}
