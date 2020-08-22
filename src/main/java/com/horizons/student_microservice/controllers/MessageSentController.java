package com.horizons.student_microservice.controllers;

import com.horizons.student_microservice.repositories.MessageSentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/messages-sent")
public class MessageSentController {
    @Autowired
    private MessageSentRepository repository;

}
