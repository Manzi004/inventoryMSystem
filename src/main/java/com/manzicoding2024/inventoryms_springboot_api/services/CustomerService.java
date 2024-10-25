package com.manzicoding2024.inventoryms_springboot_api.services;

//import com.kindson.inventoryappspringbootapi.models.Customer;
//import com.kindson.inventoryappspringbootapi.repositories.CustomerRepository;
import com.manzicoding2024.inventoryms_springboot_api.models.Customer;
import com.manzicoding2024.inventoryms_springboot_api.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }

    public Customer getCustomerById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    public void deleteCustomer(Long id){
        customerRepository.deleteById(id);
    }

}
