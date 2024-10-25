package com.manzicoding2024.inventoryms_springboot_api.models;

//import com.kindson.inventoryappspringbootapi.security.Auditable;
import com.manzicoding2024.inventoryms_springboot_api.security.models.Auditable;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "product")
@Data
public class Product extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 75)
    private String title;

    @Column(columnDefinition = "TINYTEXT")
    private String summary;

    @Column(columnDefinition = "TEXT")
    private String content;

    @ManyToOne()
    @JoinColumn(name = "subcategoryid", insertable = false, updatable = false)
    private SubCategory subCategory;
    private Long subcategoryid;

    @ManyToOne()
    @JoinColumn(name = "categoryid", insertable = false, updatable = false)
    private Category category;
    private Long categoryid;
}

