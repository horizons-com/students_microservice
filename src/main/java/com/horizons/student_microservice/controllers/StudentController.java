package com.horizons.student_microservice.controllers;

import com.horizons.student_microservice.models.Student;
import com.horizons.student_microservice.repositories.StudentRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentRepository repository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Student getStudentById(@PathVariable("id") ObjectId id) {
        return repository.findById(id);
    }

    @RequestMapping(value = "/user/{username}", method = RequestMethod.GET)
    public Student getStudentByUsername(@PathVariable("username") String username) {
        return repository.findByUsername(username);
    }
/*
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void modifyStudentById(@PathVariable("id") ObjectId id, @Valid @RequestBody Student student) {
        student.setId(id);
        repository.save(student);
    }*/

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Student createStudent( @Valid @RequestBody Student student) {
        student.setId(ObjectId.get());
        return repository.save(student);
        // return student;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteStudent(@PathVariable ObjectId id) {
        repository.delete(repository.findById(id));
    }
}
