package com.example.final_wpf_transfer.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="SMTR_MST_CUSTOMER")
public class Customer {

    @Id
    @Column(name="CUST_ID")
    private String custId;
    @Column(name="CIF_ID")
    private String cifId;
    @Column(name="TITLE_TH")
    private String titleTH;
    @Column(name="FIRSTNAME_TH")
    private String firstNameTH;
    @Column(name="LASTNAME_TH")
    private String lastNameTH;
    @Column(name="TITLE_EN")
    private String titleEN;
    @Column(name="FIRSTNAME_EN")
    private String firstNameEN;
    @Column(name="LASTNAME_EN")
    private String lastNameEN;
    @Column(name="DATE_OF_BIRTH")
    private Date dateOfbirth;
    @Column(name="EMAIL")
    private String email;
    @Column(name="MOBILE_NO")
    private String mobileNo;
    @Column(name="ADDRESS")
    private String address;
    @Column(name="GENDER")
    private String gender;
    @Column(name="CIF_IMAGE")
    private String cifImage;
    @Column(name="SIGN_IMAGE")
    private String signImage;
    @Column(name="IS_DELETE")
    private boolean isDelete;
    @Column(name="PASSPORT_NO")
    private String passportNo;
    @Column(name="REGISTER_BRANCH_CODE")
    private String registerBranchCode;
    @Column(name="SEGMENT")
    private String segment;
    @Column(name="JOINT_ACCOUNT_STATUS")
    private boolean joinAccountStatus;
    @Column(name="SENSITIVE_CUSTOMER")
    private boolean sensitiveCustomer;
}
