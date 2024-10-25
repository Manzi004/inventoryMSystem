package com.manzicoding2024.inventoryms_springboot_api.repositories;

//import com.kindson.inventoryappspringbootapi.models.Project;
import com.manzicoding2024.inventoryms_springboot_api.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
