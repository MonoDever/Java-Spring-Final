package com.example.final_wpf_transfer.controller;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.final_wpf_transfer.controller.CustomerController.resultType;
import com.example.final_wpf_transfer.dto.BaseResponseDto;
import com.example.final_wpf_transfer.dto.Bank.BankDto;
import com.example.final_wpf_transfer.dto.Bank.BankResponse;
import com.example.final_wpf_transfer.model.Bank;
import com.example.final_wpf_transfer.service.BankService;

@RestController
@RequestMapping("api/bank")
public class BankController {
    
    @Autowired
    BankService bankService;

    @GetMapping
    public String hello(){
        return "hello bank";
    }

    @GetMapping("list_bank")
    public ResponseEntity<Object> getBank(){

        List<Bank> listBank ;
        BankResponse bankResponse = new BankResponse();
        BaseResponseDto baseResponseDto = new BaseResponseDto();
        List<BankDto> listbankDto;

        //call layer service
        listBank = bankService.getListBank();

        //mapper entity to dto
        var mapper = new ModelMapper();

        listbankDto = listBank.stream().map(l -> mapper.map(l, BankDto.class)).collect(Collectors.toList());
        

        //set base response
        baseResponseDto.setResult(resultType.success.toString());
        baseResponseDto.setResultCode(HttpStatus.OK.toString());
        baseResponseDto.setResultDescription(resultType.success.toString());
        baseResponseDto.setResultTimeStamp(new Date());

        //set response
        bankResponse.setBanks(listbankDto);
        bankResponse.setReturnResult(baseResponseDto);

        return ResponseEntity.ok().body(bankResponse);
    }
    
}
