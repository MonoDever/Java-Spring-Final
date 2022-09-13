package com.example.final_wpf_transfer.dto.Bank;

import lombok.Data;

@Data
public class BankDto {
    private String bankCode;
    private String bankNameTH;
    private String bankNameEN;
    private String bankABBR;
    private long seqNo;
    private String imgPath;
    private long status;
}
