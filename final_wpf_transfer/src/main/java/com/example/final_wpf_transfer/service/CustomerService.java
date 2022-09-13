package com.example.final_wpf_transfer.service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.final_wpf_transfer.model.Customer;
import com.example.final_wpf_transfer.repository.CustomerRepository;

@Component
@Transactional
public class CustomerService {
    
    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    private EntityManager em;

    public Customer getCustomerSearchType(String type, String value){
        //check serach Type

        String cifId = "";
        String passportNo = "";
        String firstNameTH = "";
        String lastNameTH = "";

        if(SearchType.citizen.toString().equals(type)){
            cifId = value;
        }else if(SearchType.passport.toString().equals(type)){
            passportNo = value;
        }else if(SearchType.customername.toString().equals(type)){
            firstNameTH = value;
            lastNameTH = value;
        }

        var customer = new Customer();
        try{

            customer = em.createQuery
            ("select c from Customer c Where c.cifId = :cifId or c.passportNo = :passportNo or c.firstNameTH = :firstNameTH or c.lastNameTH = :lastNameTH"
            ,Customer.class)
            .setParameter("cifId", cifId)
            .setParameter("passportNo", passportNo)
            .setParameter("firstNameTH", firstNameTH)
            .setParameter("lastNameTH", lastNameTH)
            .getSingleResult();

        }catch(Exception ex){
            
                return null;

        }

        return customer;
    }

    enum SearchType{
        citizen,
        customername,
        passport
    }


}
