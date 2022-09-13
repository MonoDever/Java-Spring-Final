package com.example.final_wpf_transfer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="SMTR_MST_BANK")
public class Bank {
    @Id
    @Column(name="BANK_CODE")
    private String bankCode;
    @Column(name="BANK_NAME_TH")
    private String bankNameTH;
    @Column(name="BANK_NAME_EN")
    private String bankNameEN;
    @Column(name="BANK_ABBR")
    private String bankABBR;
    @Column(name="SEQ_NO")
    private long seqNo;
    @Column(name="IMG_PATH")
    private String imgPath;
    @Column(name="STATUS")
    private long status;
}
