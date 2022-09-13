package com.example.final_wpf_transfer.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.final_wpf_transfer.model.Customer;

@Repository
@Transactional
public interface CustomerRepository extends JpaRepository<Customer,String> {
    public Customer findBycifId(String cifId);
    // public Customer findByfirtNameOrlastName(String name);
    // public Customer findBypassport(String passport);
}
