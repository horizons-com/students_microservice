package com.horizons.student_microservice.repositories;

import com.horizons.student_microservice.models.MessageSent;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MessageSentRepository extends MongoRepository<MessageSent, String> {
    MessageSent findById(ObjectId id);
}
