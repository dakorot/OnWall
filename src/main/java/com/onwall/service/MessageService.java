package com.onwall.service;
import com.onwall.entity.Message;
import java.util.List;

public interface MessageService {

    Message postMessage(Message message);

    List<Message> getMessagesList();

    Message updateMessage(Message message, Long messageId);

    void deleteMessage(Long messageId);
}
