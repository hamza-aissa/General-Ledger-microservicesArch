package com.hamza.account.restControllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hamza.account.dto.AccountDto;
import com.hamza.account.service.AccountService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/accounts")
@AllArgsConstructor
public class AccountController {
  private AccountService accountService;

  @GetMapping("/{number}")
  public ResponseEntity<AccountDto> getAccByNumber(@PathVariable("number") String number) {
    return new ResponseEntity<AccountDto>(
        accountService.getAccountByNumber(number), HttpStatus.OK);
  }
}
