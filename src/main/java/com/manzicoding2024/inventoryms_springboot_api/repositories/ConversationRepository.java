package com.manzicoding2024.inventoryms_springboot_api.repositories;

//import com.kindson.inventoryappspringbootapi.models.Conversation;
import com.manzicoding2024.inventoryms_springboot_api.models.Conversation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConversationRepository extends JpaRepository<Conversation, Long> {
}
