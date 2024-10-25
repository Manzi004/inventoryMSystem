package com.manzicoding2024.inventoryms_springboot_api.repositories;

//import com.kindson.inventoryappspringbootapi.models.User;
import com.manzicoding2024.inventoryms_springboot_api.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,  Long> {
    User findByUsername(String username);
}
