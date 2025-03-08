package com.onwall.service;

import com.onwall.entity.Message;
import com.onwall.repository.MessageRepository;
import java.util.List;
import java.util.Objects;

import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService{

    private final MessageRepository messageRepository;

    public MessageServiceImpl(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }


    @Override
    public Message postMessage(Message message)
    {
        return messageRepository.save(message);
    }

    @Override
    public List<Message> getMessagesList()
    {
        return (List<Message>)messageRepository.findAll();
    }

    @Override
    public Message updateMessage(Message message, Long messageId)
    {
        Message messageToChange = messageRepository.findById(messageId).get();

        if(Objects.nonNull(message.getAuthor()))
        {
            messageToChange.setAuthor(message.getAuthor());
        }

        if(Objects.nonNull(message.getContent()))
        {
            messageToChange.setContent(message.getContent());
        }

        if(Objects.nonNull(message.getDate()))
        {
            messageToChange.setDate(message.getDate());
        }

        return messageRepository.save(messageToChange);
    }

    @Override
    public void deleteMessage(Long messageId)
    {
        messageRepository.deleteById(messageId);
    }
}
