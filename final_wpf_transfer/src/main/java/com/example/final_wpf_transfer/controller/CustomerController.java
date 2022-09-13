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

import com.example.final_wpf_transfer.dto.BaseResponseDto;
import com.example.final_wpf_transfer.dto.Customer.CustomerDto;
import com.example.final_wpf_transfer.dto.Customer.CustomerRequestDto;
import com.example.final_wpf_transfer.dto.Customer.CustomerResponseDto;
import com.example.final_wpf_transfer.model.Customer;
import com.example.final_wpf_transfer.service.CustomerService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/customer")
@Slf4j
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping 
    public String hello(){
        return "hello world";
    }

    @PostMapping("Customers")
    public ResponseEntity<Object> getListCustomer(@RequestBody CustomerRequestDto customerRequestDto){

        log.info("customer Request : {}",customerRequestDto);

        //init class
        Customer customer = new Customer();
        BaseResponseDto baseResponse = new BaseResponseDto();
        CustomerResponseDto response = new CustomerResponseDto();
        CustomerDto customerDto = new CustomerDto();

        //call layer service 
        customer = customerService.getCustomerSearchType(customerRequestDto.getSearchType(),customerRequestDto.getSearchValue());
        
        if(customer == null){
        //set base response
        baseResponse.setResult(resultType.fail.toString());
        baseResponse.setResultCode(HttpStatus.NOT_FOUND.name());
        baseResponse.setResultDescription(resultType.fail.toString());
        baseResponse.setResultTimeStamp(new Date());
        //set response
        response.setCustomer(customerDto);
        response.setReturnResult(baseResponse);
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
        }

        //mapper entity to dto
        var mapper = new ModelMapper();
        customerDto = mapper.map(customer, CustomerDto.class);

        //set base response
        baseResponse.setResult(resultType.success.toString());
        baseResponse.setResultCode(HttpStatus.OK.name());
        baseResponse.setResultDescription(resultType.success.toString());
        baseResponse.setResultTimeStamp(new Date());
        //set response
        response.setCustomer(customerDto);
        response.setReturnResult(baseResponse);

        return ResponseEntity.ok(response);
    }

    enum resultType{
        success,
        fail
    }

}
