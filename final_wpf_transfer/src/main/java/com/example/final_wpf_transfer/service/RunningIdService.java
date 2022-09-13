package com.example.final_wpf_transfer.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.final_wpf_transfer.model.RunningId;
import com.example.final_wpf_transfer.repository.RunningIdRepository;

@Component
@Transactional
public class RunningIdService {
    
    @Autowired
    RunningIdRepository runningIdRepository; 

    public RunningId getRunning(){
        var running = runningIdRepository.findAll();

        var runningId = running.stream().findFirst().orElse(null);


        var lastRunning = Integer.parseInt(runningId.getLastRunningId());
        lastRunning++;
        runningId.setLastRunningId(Integer.toString(lastRunning));

        runningIdRepository.save(runningId);

        return runningId;
    } 
}
