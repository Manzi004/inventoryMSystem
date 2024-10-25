package com.manzicoding2024.inventoryms_springboot_api.services;

//import com.kindson.inventoryappspringbootapi.models.Message;
//import com.kindson.inventoryappspringbootapi.repositories.MessageRepository;
import com.manzicoding2024.inventoryms_springboot_api.models.Message;
import com.manzicoding2024.inventoryms_springboot_api.repositories.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {
    private MessageRepository messageRepository;

    @Autowired
    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public List<Message> getAllMessages(){
        return messageRepository.findAll();
    }

    public Message getMessageById(Long id) {
        return messageRepository.findById(id).orElse(null);
    }

    public Message save(Message message) {
        return messageRepository.save(message);
    }

    public void deleteMessage(Long id){
        messageRepository.deleteById(id);
    }
}
