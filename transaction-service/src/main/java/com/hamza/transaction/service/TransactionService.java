package com.hamza.transaction.service;

import com.hamza.transaction.dto.TransactionDto;

public interface TransactionService {
  TransactionDto getTransactionById(Long id);
}
