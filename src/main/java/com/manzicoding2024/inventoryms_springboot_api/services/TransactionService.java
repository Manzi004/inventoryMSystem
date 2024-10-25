package com.manzicoding2024.inventoryms_springboot_api.services;

//import com.kindson.inventoryappspringbootapi.models.Transaction;
//import com.kindson.inventoryappspringbootapi.repositories.TransactionRepository;
import com.manzicoding2024.inventoryms_springboot_api.models.Transaction;
import com.manzicoding2024.inventoryms_springboot_api.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    private TransactionRepository transactionRepository;

    @Autowired
    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public List<Transaction> getAllTransactions(){
        return transactionRepository.findAll();
    }

    public Transaction getTransactionById(Long id) {
        return transactionRepository.findById(id).orElse(null);
    }

    public Transaction save(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    public void deleteTransaction(Long id){
        transactionRepository.deleteById(id);
    }
}