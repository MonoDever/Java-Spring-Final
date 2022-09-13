package com.example.final_wpf_transfer.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.final_wpf_transfer.model.Bank;

@Repository
@Transactional
public interface BankRepository extends JpaRepository<Bank,String> {
    // public List<Bank> findAllList();
}
