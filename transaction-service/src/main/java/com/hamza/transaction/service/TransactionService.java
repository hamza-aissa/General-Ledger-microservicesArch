package com.hamza.transaction.service;

import com.hamza.transaction.dto.ApiResponseDto;

public interface TransactionService {
  ApiResponseDto getTransactionById(Long id);
}
