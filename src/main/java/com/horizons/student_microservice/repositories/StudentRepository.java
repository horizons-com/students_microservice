package com.horizons.student_microservice.repositories;

import org.bson.types.ObjectId;

public interface StudentRepository extends MongoRepository <Student, String>{
    Student findById(ObjectId id);
}
