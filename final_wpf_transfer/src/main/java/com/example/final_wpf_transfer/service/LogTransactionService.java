package com.example.final_wpf_transfer.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.final_wpf_transfer.model.LogTransaction;
import com.example.final_wpf_transfer.repository.LogTransactionRepository;

@Component
@Transactional
public class LogTransactionService {
    @Autowired
    LogTransactionRepository logTransactionRepository;

    public LogTransaction addLogTransaction(LogTransaction request){
        logTransactionRepository.save(request);

        var resultLog = logTransactionRepository.findBytranCode(request.getTranCode());

        return resultLog;
    }
}
