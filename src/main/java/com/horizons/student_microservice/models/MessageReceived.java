package com.horizons.student_microservice.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.util.Date;

public class MessageReceived {
    @Id
    private ObjectId id;
    private Date dateReceived;
    private String messageId;

    public MessageReceived() {
    }

    public MessageReceived(ObjectId id, Date dateReceived, String messageId) {
        this.id = id;
        this.dateReceived = dateReceived;
        this.messageId = messageId;
    }

    public String getId() {
        return id.toHexString();
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Date getDateReceived() {
        return dateReceived;
    }

    public void setDateSent(Date dateReceived) {
        this.dateReceived = dateReceived;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }
}
