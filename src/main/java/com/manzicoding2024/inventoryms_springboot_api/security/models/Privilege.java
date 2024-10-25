package com.manzicoding2024.inventoryms_springboot_api.security.models;

import com.manzicoding2024.inventoryms_springboot_api.models.User;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Entity
@Data
public class Privilege extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;


    /*
        Mapping Privilege table to User table, the join column is
        userid
        we use specific annotation
        Many to one because the relation from Privilege to user is
        Many to one, and we add join column
     */
    @ManyToOne
    @JoinColumn(name= "userid", insertable = false, updatable = false)
    private User user;
    private Long userid;

    /*
        Mapping Privilege table to Role table, the join column is
        roleid
        we use specific annotation
        Many to one because the relation from Privilege to Role is
        Many to one, and we add join column
     */
    @ManyToOne
    @JoinColumn(name= "roleid", insertable = false, updatable = false)
    private Role role;
    private Long roleid;

    /*
      Here we're establishing a mapping between 2 tables: Privileges and UserPrivilegeAssignment,
      the relation is One to Many, we use a proper annotation and we specify a field, here we use "privilege" field
      this will return a list of privileges for the users
   */
    @OneToMany(mappedBy = "privilege")
    private List<UserPrivilegeAssignment> users;
}
