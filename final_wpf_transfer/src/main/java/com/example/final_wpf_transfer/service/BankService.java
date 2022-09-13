package com.example.final_wpf_transfer.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.final_wpf_transfer.model.Bank;
import com.example.final_wpf_transfer.repository.BankRepository;

@Component
@Transactional
public class BankService {
    
    @Autowired
    BankRepository bankRepository;

    public List<Bank> getListBank(){
        var banks = bankRepository.findAll();
        return banks;
    }

}
