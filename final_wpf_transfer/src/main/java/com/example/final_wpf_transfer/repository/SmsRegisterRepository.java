package com.example.final_wpf_transfer.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.final_wpf_transfer.model.SmsRegister;

@Repository
@Transactional
public interface SmsRegisterRepository extends JpaRepository<SmsRegister,String> {
    
}
