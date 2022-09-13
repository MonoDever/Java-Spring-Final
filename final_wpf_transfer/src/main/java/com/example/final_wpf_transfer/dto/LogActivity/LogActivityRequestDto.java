package com.example.final_wpf_transfer.dto.LogActivity;

import java.util.Date;

import lombok.Data;

@Data
public class LogActivityRequestDto {
    private String actId;
    private int actType;
    private Date actDate;
    private String actDetail;
    private String actFullDetail;
    private String userId;
    private String comName;
    private int tranId;
    private int tranType;
    private String tranCode;
    private String tranBankFrom;
    private String tranBankTo;
    private String memo;
    private String errCode;
    private String errDesc;
    private int actStatus;
    private String pageCode;
    private String pageName;
}
