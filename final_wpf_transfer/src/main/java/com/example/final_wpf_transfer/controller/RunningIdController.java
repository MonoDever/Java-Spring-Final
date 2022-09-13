package com.example.final_wpf_transfer.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.final_wpf_transfer.controller.CustomerController.resultType;
import com.example.final_wpf_transfer.dto.BaseResponseDto;
import com.example.final_wpf_transfer.dto.RunningId.RunningIdResponseDto;
import com.example.final_wpf_transfer.model.RunningId;
import com.example.final_wpf_transfer.service.RunningIdService;

@RestController
@RequestMapping("api/runningid")
public class RunningIdController {

    @Autowired
    RunningIdService runningIdService;

    @GetMapping
    public String hello(){
        return "hello running";
    }

    @GetMapping("get_running_id")
    public ResponseEntity<Object> getRunningId(){

        //init class
        RunningId runningId = new RunningId();
        BaseResponseDto baseResponseDto = new BaseResponseDto();
        RunningIdResponseDto response = new RunningIdResponseDto();

        //call layer service
        runningId = runningIdService.getRunning();

        //set base response
        baseResponseDto.setResult(resultType.success.toString());
        baseResponseDto.setResultCode(HttpStatus.OK.toString());
        baseResponseDto.setResultDescription(resultType.success.toString());
        baseResponseDto.setResultTimeStamp(new Date());

        //set response
        var setRunningId = runningId.getPrefix()+String.format("%04d", Integer.parseInt(runningId.getLastRunningId()));

        response.setRunningId(setRunningId);
        response.setPrefix(runningId.getPrefix());
        response.setReturnResult(baseResponseDto);

        return ResponseEntity.ok().body(response);
    }
}
