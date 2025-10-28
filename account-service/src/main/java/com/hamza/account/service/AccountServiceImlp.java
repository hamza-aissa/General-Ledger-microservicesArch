package com.hamza.account.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hamza.account.dto.AccountDto;
import com.hamza.account.entities.Account;
import com.hamza.account.repos.AccountRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AccountServiceImpl implements AccountService {
  private AccountRepository accountRepository;

  @Override
  public AccountDto getAccountByNumber(String number){
    Account acc = accountRepository.findByAccountNumber(number);
    AccountDto accountDto = new AccountDto(
        acc.getId();
        )
  }
}
