package com.manzicoding2024.inventoryms_springboot_api.models;

//import com.kindson.inventoryappspringbootapi.security.Auditable;
import com.manzicoding2024.inventoryms_springboot_api.security.Auditable;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "brand")
@Data
public class Brand extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 75)
    private String title;

    @Column(columnDefinition = "TINYTEXT")
    private String summary;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    @Column(columnDefinition = "TEXT")
    private String content;

    // Getters and Setters
}
