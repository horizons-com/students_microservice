package com.horizons.student_microservice.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.util.Date;

public class MessageSent {
    @Id
    private ObjectId messageSentId;
    private Date dateSent;
    private ObjectId messageId;
}
