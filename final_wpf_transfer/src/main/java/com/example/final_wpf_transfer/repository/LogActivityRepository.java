package com.example.final_wpf_transfer.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.final_wpf_transfer.model.LogActivity;

@Repository
@Transactional
public interface LogActivityRepository extends JpaRepository<LogActivity,String> {
    
}
