package com.example.final_wpf_transfer.dto.RunningId;

import lombok.Data;

@Data
public class RunningIdDto {
    private String runningType;
    private String prefix;
    private String suffix;
    private String dayRunning;
    private String monthRunning;
    private String yearRunning;
    private String lastRunningId;
    private String minRunningLength;
    private String maxRunningLength;
    private String currentRunningLength;
}
