package com.example.final_wpf_transfer.controller;

import java.util.Date;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.final_wpf_transfer.controller.CustomerController.resultType;
import com.example.final_wpf_transfer.dto.BaseResponseDto;
import com.example.final_wpf_transfer.dto.LogActivity.LogActivityRequestDto;
import com.example.final_wpf_transfer.dto.LogTransaction.LogTransactionRequestDto;
import com.example.final_wpf_transfer.dto.LogTransaction.LogTransactionResponseDto;
import com.example.final_wpf_transfer.model.LogActivity;
import com.example.final_wpf_transfer.model.LogTransaction;
import com.example.final_wpf_transfer.service.LogActivityService;
import com.example.final_wpf_transfer.service.LogTransactionService;
import com.example.final_wpf_transfer.utility.enums.Enums.ActivityType;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("api/log")
public class LogController {
    
    @Autowired
    LogActivityService logActivityService;

    @Autowired
    LogTransactionService logTransactionService;

    @GetMapping
    public String hello(){
        return "Hello log";
    }

    @PostMapping("add_log_activity")
    public ResponseEntity<Object> addLogActivity(@RequestBody LogActivityRequestDto requestBody){
        log.info("requestBody : {}",requestBody);

        //init class
        BaseResponseDto baseResponseDto = new BaseResponseDto();

        //validate
        if(requestBody.getActType() == ActivityType.SearchCustomer.ordinal() || requestBody.getActType() == ActivityType.PreTransfer.ordinal() || requestBody.getActType() == ActivityType.CompleteTransfer.ordinal()){

            if(requestBody.getActFullDetail() == null ||requestBody.getActFullDetail().isEmpty()){

                return ResponseEntity.badRequest().build();
            }
        }

        //map dto to entity
        var mapper = new ModelMapper();

        var request = mapper.map(requestBody, LogActivity.class);

        //call Layer service
        var result = logActivityService.addLogActivity(request);

        if(!result){
            baseResponseDto.setResult(resultType.fail.toString());
            baseResponseDto.setResultCode(HttpStatus.UNPROCESSABLE_ENTITY.toString());
            baseResponseDto.setResultDescription(resultType.fail.toString());
            baseResponseDto.setResultTimeStamp(new Date());
            return ResponseEntity.unprocessableEntity().body(baseResponseDto);
        }

        //set base response
        baseResponseDto.setResult(resultType.success.toString());
        baseResponseDto.setResultCode(HttpStatus.OK.toString());
        baseResponseDto.setResultDescription(resultType.success.toString());
        baseResponseDto.setResultTimeStamp(new Date());
        
        return ResponseEntity.ok().body(baseResponseDto);
    }

    @PostMapping("add_log_transaction")
    public ResponseEntity<Object> addLogTransaction(@RequestBody LogTransactionRequestDto requestBody){
        log.info("request logTransaction : {}",requestBody);

        //init class
        BaseResponseDto baseResponseDto = new BaseResponseDto();
        LogTransactionResponseDto responseDto = new LogTransactionResponseDto();
 
        //map dto to entity
        var mapper = new ModelMapper();

        var request = mapper.map(requestBody, LogTransaction.class);

        //call layer Service
        var result = logTransactionService.addLogTransaction(request);

        if(result == null){
            baseResponseDto.setResult(resultType.fail.toString());
            baseResponseDto.setResultCode(HttpStatus.UNPROCESSABLE_ENTITY.toString());
            baseResponseDto.setResultDescription(resultType.fail.toString());
            baseResponseDto.setResultTimeStamp(new Date());
            return ResponseEntity.unprocessableEntity().body(baseResponseDto);
        }

        //set base response
        baseResponseDto.setResult(resultType.success.toString());
        baseResponseDto.setResultCode(HttpStatus.OK.toString());
        baseResponseDto.setResultDescription(resultType.success.toString());
        baseResponseDto.setResultTimeStamp(new Date());

        //set response
        responseDto.setTranId(result.getTranId());
        responseDto.setTranType(result.getTranType());
        responseDto.setReturnResult(baseResponseDto);
        
        return ResponseEntity.ok().body(responseDto);
    }

}
