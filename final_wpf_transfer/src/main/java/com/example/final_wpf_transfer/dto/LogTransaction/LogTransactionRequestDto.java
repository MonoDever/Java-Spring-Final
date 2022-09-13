package com.example.final_wpf_transfer.dto.LogTransaction;

import java.util.Date;

import lombok.Data;

@Data
public class LogTransactionRequestDto {
    private Long tranId;
    private Date tranDate;
    private String tranCode;
    private int tranType;;
    private String custId;
    private String cifId;
    private String mobileNo;
    private String fromBankCode;
    private int fromAccType;
    private String fromAccNo;
    private String fromAccNickName;
    private String fromAccName;
    private String toBankCode;
    private int toAccType;
    private String toAccNo;
    private String toAccNickName;
    private String toAccName;
    private double fee1;
    private double amount;
    private String currencyCode;
    private int tranStatus;
    private String memo;
    private String errCode;
    private String errDesc;
}
