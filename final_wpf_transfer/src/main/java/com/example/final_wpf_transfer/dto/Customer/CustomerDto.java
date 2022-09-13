package com.example.final_wpf_transfer.dto.Customer;

import java.util.Date;

import lombok.Data;

@Data
public class CustomerDto {
    private String custId;
    private String cifId;
    private String titleTH;
    private String firstNameTH;
    private String lastNameTH;
    private String titleEN;
    private String firstNameEN;
    private String lastNameEN;
    private Date dateOfbirth;
    private String email;
    private String mobileNo;
    private String address;
    private String gender;
    private String cifImage;
    private String signImage;
    private boolean isDelete;
    private String passportNo;
    private String registerBranchCode;
    private String segment;
    private boolean joinAccountStatus;
    private boolean sensitiveCustomer;
}
