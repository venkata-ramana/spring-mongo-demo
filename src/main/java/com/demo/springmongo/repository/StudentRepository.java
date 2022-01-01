package com.demo.springmongo.repository;

import com.demo.springmongo.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {
}
