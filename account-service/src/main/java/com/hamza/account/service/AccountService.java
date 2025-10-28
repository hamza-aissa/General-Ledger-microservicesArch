package com.hamza.account.service;

import com.hamza.account.dto.AccountDto;

public interface AccountService {
  AccountDto getAccountByNumber(String number);
}
