package com.horizons.student_microservice.controllers;

import com.horizons.student_microservice.models.MessageSent;
import com.horizons.student_microservice.repositories.MessageSentRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/messages-sent")
public class MessageSentController {
    @Autowired
    private MessageSentRepository repository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<MessageSent> getAllMessagesSent() {
        return repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public MessageSent getMessageSentById(@PathVariable("id") ObjectId id) {
        return repository.findById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void modifyMessageSentById(@PathVariable("id") ObjectId id, @Valid @RequestBody MessageSent messageSent) {
        messageSent.setId(id);
        repository.save(messageSent);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public MessageSent createMessageSent( @Valid @RequestBody MessageSent messageSent) {
        messageSent.setId(ObjectId.get());
        repository.save(messageSent);
        return messageSent;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteMessageSent(@PathVariable ObjectId id) {
        repository.delete(repository.findById(id));
    }
}
