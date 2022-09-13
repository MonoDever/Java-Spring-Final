package com.example.final_wpf_transfer.dto.LogTransaction;

import com.example.final_wpf_transfer.dto.BaseResponseDto;

import lombok.Data;

@Data
public class LogTransactionResponseDto {
    private Long tranId;
    private int tranType;
    private BaseResponseDto returnResult;
}
