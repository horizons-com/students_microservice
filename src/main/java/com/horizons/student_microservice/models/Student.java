package com.horizons.student_microservice.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Student {
    @Id
    public ObjectId id;
    public String name;
    public int mentorId;
    private String messagesSent;
    private String messagesReceived;

    public Student() {

    }
    public Student(ObjectId id, String name, int mentorId) {
        this.id = id;
        this.name = name;
        this.mentorId = mentorId;
    }

    public String getId() {
        return id.toHexString();
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMentorId() {
        return mentorId;
    }

    public void setMentorId(int mentorId) {
        this.mentorId = mentorId;
    }

    public String getMessagesSent() {
        return messagesSent;
    }

    public void setMessagesSent(String messagesSent) {
        this.messagesSent = messagesSent;
    }

    public String getMessagesReceived() {
        return messagesReceived;
    }

    public void setMessagesReceived(String messagesReceived) {
        this.messagesReceived = messagesReceived;
    }
}
