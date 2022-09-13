package com.example.final_wpf_transfer.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;

import lombok.Data;

@Entity
@Data
@Table(name="SMTR_MST_SMS_BANKING_REGIS_ACCOUNT")
public class SmsRegister {
    @Id
    @Column(name="ACCOUNT_NO")
    private String accountNo; 
    @Column(name = "CREATED_BY")
    @CreatedBy
    private String createdBy;
    @Column(name = "CREATED_DATE")
    @CreatedDate
    private Date createdDate;
}
