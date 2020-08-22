package com.horizons.student_microservice.repositories;

import com.horizons.student_microservice.models.Student;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository <Student, String>{
    Student findById(ObjectId id);
}
