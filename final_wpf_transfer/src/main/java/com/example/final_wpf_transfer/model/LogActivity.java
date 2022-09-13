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
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;

@Entity
@Data
@Table(name = "SMTR_LOG_ACTIVITY")
@EntityListeners(AuditingEntityListener.class)
public class LogActivity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ACT_ID")
    private String actId;
    @Column(name="ACT_TYPE")
    private int actType;
    @Column(name="ACT_DATE")
    private Date actDate;
    @Column(name="ACT_DETAIL")
    private String actDetail;
    @Column(name="ACT_FULL_DETAIL")
    private String actFullDetail;
    @Column(name="USER_ID")
    private String userId;
    @Column(name="COMNAME")
    private String comName;
    @Column(name="TRAN_ID")
    private int tranId;
    @Column(name="TRAN_TYPE")
    private int tranType;
    @Column(name="TRAN_CODE")
    private String tranCode;
    @Column(name="TRAN_BANK_FROM")
    private String tranBankFrom;
    @Column(name="TRAN_BANK_TO")
    private String tranBankTo;
    @Column(name="MEMO")
    private String memo;
    @Column(name="ERR_CODE")
    private String errCode;
    @Column(name="ERR_DESC")
    private String errDesc;
    @Column(name="ACT_STATUS")
    private int actStatus;
    @Column(name="PAGE_CODE")
    private String pageCode;
    @Column(name="PAGE_NAME")
    private String pageName;
    @Column(name = "CREATED_BY")
    @CreatedBy
    private String createdBy;
    @Column(name = "CREATED_DATE")
    @CreatedDate
    private Date createdDate;
}
