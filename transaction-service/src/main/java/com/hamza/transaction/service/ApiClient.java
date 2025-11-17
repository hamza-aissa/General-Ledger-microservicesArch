package com.hamza.transaction.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.hamza.transaction.dto.AccountDto;

@FeignClient(url = "http://localhost:8080", value = "ACCOUNT")
public interface ApiClient {

  @GetMapping("api/accounts/{number}")
  AccountDto getAccByNumber(@PathVariable("number") String number);
}
