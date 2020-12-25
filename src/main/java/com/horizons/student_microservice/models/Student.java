package com.horizons.student_microservice.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.util.Map;

public class Student {
    @Id
    private ObjectId id;
    private String username;
    private String firstName;
    private String lastName;
    private String middleName;
    private int schoolId;
    private String gradeLevel;
    private Object avatar;
    private int counselorId;
    public int mentorId;
    private Map<String, String> socialMedia;

/*    public Student(ObjectId id, String username,String firstName, String lastName, String middleName, int schoolId, String gradeLevel, Object avatar, int counselorId, int mentorId, Map<String, String> socialMedia) {
        this.id = id;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.schoolId = schoolId;
        this.gradeLevel = gradeLevel;
        this.avatar = avatar;
        this.counselorId = counselorId;
        this.mentorId = mentorId;
        this.socialMedia = socialMedia;
    }*/

    public String getId() {
        return id.toHexString();
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public Object getAvatar() {
        return avatar;
    }

    public void setAvatar(Object avatar) {
        this.avatar = avatar;
    }

    public int getCounselorId() {
        return counselorId;
    }

    public void setCounselorId(int counselorId) {
        this.counselorId = counselorId;
    }

    public int getMentorId() {
        return mentorId;
    }

    public void setMentorId(int mentorId) {
        this.mentorId = mentorId;
    }

    public Map<String, String> getSocilaMedia() {
        return socialMedia;
    }

    public void setSocilaMedia(Map<String, String> socialMedia) {
        this.socialMedia = socialMedia;
    }
}
