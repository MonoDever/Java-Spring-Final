package com.example.final_wpf_transfer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="SMTR_RUNNING_ID")
public class RunningId {
    @Id
    @Column(name="RUNNING_TYPE")
    private String runningType;
    @Column(name="PREFIX")
    private String prefix;
    @Column(name="SUFFIX")
    private String suffix;
    @Column(name="DAY_RUNNING")
    private String dayRunning;
    @Column(name="MONTH_RUNNING")
    private String monthRunning;
    @Column(name="YEAR_RUNNING")
    private String yearRunning;
    @Column(name="LAST_RUNNING_ID")
    private String lastRunningId;
    @Column(name="MIN_RUNNING_LENGTH")
    private String minRunningLength;
    @Column(name="MAX_RUNNING_LENGTH")
    private String maxRunningLength;
    @Column(name="CURRENT_RUNNING_LENGTH")
    private String currentRunningLength;
}
