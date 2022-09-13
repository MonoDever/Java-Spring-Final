package com.example.final_wpf_transfer.dto.Bank;

import java.util.List;

import com.example.final_wpf_transfer.dto.BaseResponseDto;

import lombok.Data;

@Data
public class BankResponse {
    private List<BankDto> banks;
    private BaseResponseDto returnResult;
}
