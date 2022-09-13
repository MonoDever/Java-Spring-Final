package com.example.final_wpf_transfer.dto;

import java.util.Date;

import lombok.Data;

@Data
public class BaseResponseDto {
    private String result;
    private String resultCode;
    private String resultDescription;
    private String errorRefId;
    private Date resultTimeStamp;
}
