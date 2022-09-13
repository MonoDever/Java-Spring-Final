package com.example.final_wpf_transfer.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.final_wpf_transfer.model.SmsRegister;
import com.example.final_wpf_transfer.repository.SmsRegisterRepository;

@Component
@Transactional
public class SmsRegisterService {
    
    @Autowired
 SmsRegisterRepository SmsRegisterRepository;

 public boolean AddSmsRegister(SmsRegister smsRequest){
    var smsResult = SmsRegisterRepository.save(smsRequest);
    if(smsResult != null){
        return true;
        
    }
    return false;

 } 

}
