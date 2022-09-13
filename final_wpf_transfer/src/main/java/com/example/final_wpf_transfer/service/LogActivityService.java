package com.example.final_wpf_transfer.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.final_wpf_transfer.model.LogActivity;
import com.example.final_wpf_transfer.repository.LogActivityRepository;

@Component
@Transactional
public class LogActivityService {
    
    @Autowired
    LogActivityRepository logActivityRepository;

    public boolean addLogActivity(LogActivity request){
        logActivityRepository.save(request);
        return true;
    }

}
