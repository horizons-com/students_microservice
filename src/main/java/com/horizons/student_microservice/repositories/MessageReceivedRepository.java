package com.horizons.student_microservice.repositories;

import com.horizons.student_microservice.models.MessageReceived;
import com.horizons.student_microservice.models.MessageSent;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MessageReceivedRepository extends MongoRepository<MessageReceived, String> {
    MessageReceived findById(ObjectId id);
}
