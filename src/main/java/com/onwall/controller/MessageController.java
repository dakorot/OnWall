package com.onwall.controller;

import com.onwall.entity.Message;
import com.onwall.service.MessageService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class MessageController {

    @Autowired
    private MessageService messageService;

    @PostMapping("/messages")
    public Message postMessage(@RequestBody Message message)
    {
        return messageService.postMessage(message);
    }

    @GetMapping("/messages")
    public List<Message> getMessagesList()
    {
        return messageService.getMessagesList();
    }

    @PutMapping("/messages/{id}")
    public Message updateMessage(Message message, Long messageId)
    {
        return messageService.updateMessage(message, messageId);
    }

    @DeleteMapping("/messages/{id}")
    public String deleteMessage(Long messageId)
    {
        messageService.deleteMessage(messageId);

        return "Deleted message with id of " + messageId + " successfully.";
    }




}
