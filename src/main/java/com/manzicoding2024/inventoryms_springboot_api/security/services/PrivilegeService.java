package com.manzicoding2024.inventoryms_springboot_api.security.services;

import com.manzicoding2024.inventoryms_springboot_api.repositories.UserRepository;
import com.manzicoding2024.inventoryms_springboot_api.security.models.Privilege;
import com.manzicoding2024.inventoryms_springboot_api.security.models.Role;
import com.manzicoding2024.inventoryms_springboot_api.security.repositories.PrivilegeRepository;
import com.manzicoding2024.inventoryms_springboot_api.security.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrivilegeService {

    @Autowired
    private PrivilegeRepository privilegeRepository;

    public List<Privilege> findAll(){
        return privilegeRepository.findAll();
    }

    public Privilege getPrivilege(int id){
        return privilegeRepository.findById((long) id).orElse(null);
    }

    public  Privilege save(Privilege privilege){
        return privilegeRepository.save(privilege);
    }

    public void delete(Integer id) {
        privilegeRepository.deleteById(Long.valueOf(id));
    }

    public Privilege getById(Integer id) {
        return privilegeRepository.findById(Long.valueOf(id)).orElse(null);
    }

    public void update(Privilege privilege) {
        privilegeRepository.save(privilege);
    }
}
