package com.example.final_wpf_transfer.repository;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.final_wpf_transfer.model.LogTransaction;

@Repository
@Transactional
public interface LogTransactionRepository extends JpaRepository<LogTransaction,String>  {
    public LogTransaction findBytranCode(String tranCode);
}
