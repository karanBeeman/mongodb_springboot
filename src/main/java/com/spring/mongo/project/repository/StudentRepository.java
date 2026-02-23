package com.spring.mongo.project.repository;

import com.spring.mongo.project.entity.StudentEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<StudentEntity, String> {

}
