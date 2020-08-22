package com.horizons.student_microservice.controllers;

import com.horizons.student_microservice.models.MessageReceived;
import com.horizons.student_microservice.models.MessageSent;
import com.horizons.student_microservice.repositories.MessageReceivedRepository;
import com.horizons.student_microservice.repositories.MessageSentRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/messages-received")
public class MessageReceivedController {
    @Autowired
    private MessageReceivedRepository repository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<MessageReceived> getAllMessagesReceived() {
        return repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public MessageReceived getMessageReceivedById(@PathVariable("id") ObjectId id) {
        return repository.findById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void modifyMessageReceivedById(@PathVariable("id") ObjectId id, @Valid @RequestBody MessageReceived messageReceived) {
        messageReceived.setId(id);
        repository.save(messageReceived);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public MessageReceived createMessageReceived( @Valid @RequestBody MessageReceived messageReceived) {
        messageReceived.setId(ObjectId.get());
        repository.save(messageReceived);
        return messageReceived;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteMessageReceived(@PathVariable ObjectId id) {
        repository.delete(repository.findById(id));
    }
}
