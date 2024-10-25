package com.manzicoding2024.inventoryms_springboot_api.repositories;

//import com.kindson.inventoryappspringbootapi.models.OrderItem;
import com.manzicoding2024.inventoryms_springboot_api.models.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
