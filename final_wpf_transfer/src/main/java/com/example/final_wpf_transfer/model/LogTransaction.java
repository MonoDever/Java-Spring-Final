package com.example.final_wpf_transfer.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;

@Entity
@Data
@Table(name = "SMTR_LOG_TRANSACTION")
@EntityListeners(AuditingEntityListener.class)
public class LogTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TRAN_ID")
    private Long tranId;
    @Column(name = "TRAN_DATE")
    private Date tranDate;
    @Column(name = "TRAN_CODE")
    private String tranCode;
    @Column(name = "TRAN_TYPE")
    private int tranType;
    @Column(name = "CUST_ID")
    private String custId;
    @Column(name = "CIF_ID")
    private String cifId;
    @Column(name = "MOBILE_NO")
    private String mobileNo;
    @Column(name = "FROM_BANK_CODE")
    private String fromBankCode;
    @Column(name = "FROM_ACC_TYPE")
    private int fromAccType;
    @Column(name = "FROM_ACC_NO")
    private String fromAccNo;
    @Column(name = "FROM_ACC_NICK_NAME")
    private String fromAccNickName;
    @Column(name = "FROM_ACC_NAME")
    private String fromAccName;
    @Column(name = "TO_BANK_CODE")
    private String toBankCode;
    @Column(name = "TO_ACC_TYPE")
    private int toAccType;
    @Column(name = "TO_ACC_NO")
    private String toAccNo;
    @Column(name = "TO_ACC_NICK_NAME")
    private String toAccNickName;
    @Column(name = "TO_ACC_NAME")
    private String toAccName;
    @Column(name = "FEE1")
    private double fee1;
    @Column(name = "AMOUNT")
    private double amount;
    @Column(name = "CURRENCY_CODE")
    private String currencyCode;
    @Column(name = "TRAN_STATUS")
    private int tranStatus;
    @Column(name = "MEMO")
    private String memo;
    @Column(name = "ERR_CODE")
    private String errCode;
    @Column(name = "ERR_DESC")
    private String errDesc;
    @Column(name = "CREATED_BY")
    @CreatedBy
    private String createdBy;
    @Column(name = "CREATED_DATE")
    @CreatedDate
    private Date createdDate;
    @Column(name="UPDATED_BY")
    @LastModifiedBy
    private String updatedBy;
    @LastModifiedDate
    @Column(name="UPDATED_DATE")
    private Date updatedDate;
}
