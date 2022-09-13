package com.example.final_wpf_transfer.dto.Customer;

import com.example.final_wpf_transfer.dto.BaseResponseDto;

import lombok.Data;

@Data
public class CustomerResponseDto {
    
    private CustomerDto customer;
    private BaseResponseDto returnResult;

}
