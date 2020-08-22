package com.horizons.student_microservice.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.util.Date;

public class MessageSent {
    @Id
    private ObjectId id;
    private Date dateSent;
    private ObjectId messageId;

    public MessageSent() {
    }

    public MessageSent(ObjectId id, Date dateSent, ObjectId messageId) {
        this.id = id;
        this.dateSent = dateSent;
        this.messageId = messageId;
    }

    public String getId() {
        return id.toHexString();
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Date getDateSent() {
        return dateSent;
    }

    public void setDateSent(Date dateSent) {
        this.dateSent = dateSent;
    }

    public ObjectId getMessageId() {
        return messageId;
    }

    public void setMessageId(ObjectId messageId) {
        this.messageId = messageId;
    }
}
