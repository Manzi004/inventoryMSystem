package com.manzicoding2024.inventoryms_springboot_api.security.models;

import com.manzicoding2024.inventoryms_springboot_api.models.User;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class UserPrivilegeAssignment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "privilegeid", insertable = false, updatable = false)
    private Privilege privilege;
    private Long privilegeid;

    @ManyToOne
    @JoinColumn(name = "userid", insertable = false, updatable = false)
    private User user;
    private Long userid;

    /*
        This class will need this class
        when we need to insert new assignment, we will need
        userid and privilege id we want to assign to that user
     */
    public UserPrivilegeAssignment(Long privilegeid, Long userid) {
        this.privilegeid = privilegeid;
        this.userid = userid;
    }
}
