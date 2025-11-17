package com.hamza.transaction.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.hamza.transaction.dto.AccountDto;
import com.hamza.transaction.dto.ApiResponseDto;
import com.hamza.transaction.dto.TransactionDto;
import com.hamza.transaction.entities.Transaction;
import com.hamza.transaction.repos.TransactionRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class TransactionServiceImpl implements TransactionService {

  private TransactionRepository transactionRepository;
  // private WebClient webClient;
  private ApiClient apiClient;

  @Override
  public ApiResponseDto getTransactionById(Long id) {
    Transaction transaction = transactionRepository.findById(id).get();
    AccountDto accountDto = apiClient.getAccByNumber(transaction.getAccountNumber());
    TransactionDto transactionDto = new TransactionDto(
        transaction.getId(),
        transaction.getAccountNumber(),
        transaction.getAmount(),
        transaction.getDescription(),
        accountDto.getAccountHolderName());

    ApiResponseDto apiResponseDto = new ApiResponseDto();
    apiResponseDto.setTransactionDto(transactionDto);
    apiResponseDto.setAccountDto(accountDto);

    return apiResponseDto;
  }
}
