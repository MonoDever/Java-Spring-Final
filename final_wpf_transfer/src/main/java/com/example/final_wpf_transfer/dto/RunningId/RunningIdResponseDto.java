package com.example.final_wpf_transfer.dto.RunningId;

import com.example.final_wpf_transfer.dto.BaseResponseDto;

import lombok.Data;

@Data
public class RunningIdResponseDto {
    private String runningId;
    private String prefix;
    private BaseResponseDto returnResult;
}
