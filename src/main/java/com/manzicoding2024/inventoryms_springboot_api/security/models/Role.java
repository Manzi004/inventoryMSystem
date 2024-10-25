package com.manzicoding2024.inventoryms_springboot_api.security.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private String details;


    /*
        Here we're establishing a mapping between 2 tables: Role and Privilege
        we use a proper annotation and we specify a field, here we use "role" field
        this field is the same we have in privilege mapping
     */
    @OneToMany(mappedBy = "role")
    private List<Privilege> privileges;

}
