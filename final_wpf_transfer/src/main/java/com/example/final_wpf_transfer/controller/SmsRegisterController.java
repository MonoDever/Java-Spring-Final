package com.example.final_wpf_transfer.controller;

import java.util.Date;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.final_wpf_transfer.controller.CustomerController.resultType;
import com.example.final_wpf_transfer.dto.BaseResponseDto;
import com.example.final_wpf_transfer.model.SmsRegister;
import com.example.final_wpf_transfer.service.SmsRegisterService;

@RestController
@RequestMapping("api/smsregister")
public class SmsRegisterController {
    
    @Autowired
    SmsRegisterService smsRegisterService;

    @GetMapping
    public String hello(){
        return "hello smsRegister";
    }

    @PostMapping("add_smsregister")
    public ResponseEntity<Object> AddSmsRegister(String request){

        //init class
        BaseResponseDto baseResponseDto = new BaseResponseDto();
        SmsRegister smsRegister = new SmsRegister();

        smsRegister.setAccountNo(request);
        smsRegister.setCreatedBy(request);
        smsRegister.setCreatedDate(new Date());

        //call

        var smsReponse = smsRegisterService.AddSmsRegister(smsRegister);

        if(!smsReponse){
            baseResponseDto.setResult(resultType.fail.toString());
            baseResponseDto.setResultCode(HttpStatus.UNPROCESSABLE_ENTITY.toString());
            baseResponseDto.setResultDescription(resultType.fail.toString());
            baseResponseDto.setResultTimeStamp(new Date());
            return ResponseEntity.unprocessableEntity().body(baseResponseDto);
        }

        //set base
        //set base response
        baseResponseDto.setResult(resultType.success.toString());
        baseResponseDto.setResultCode(HttpStatus.OK.toString());
        baseResponseDto.setResultDescription(resultType.success.toString());
        baseResponseDto.setResultTimeStamp(new Date());

        return ResponseEntity.ok().body(baseResponseDto);
    }
}
