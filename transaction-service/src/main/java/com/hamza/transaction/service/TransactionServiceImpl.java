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
  private WebClient webClient;

  @Override
  public ApiResponseDto getTransactionById(Long id) {
    Transaction transaction = transactionRepository.findById(id).get();

    AccountDto accountDto = webClient.get()
        .uri("http://localhost:8080/api/accounts/" + transaction.getAccountNumber())
        .retrieve()
        .bodyToMono(AccountDto.class)
        .block();

    TransactionDto transactionDto = new TransactionDto(
        transaction.getId(),
        transaction.getAccountNumber(),
        transaction.getAmount(),
        transaction.getDescription());

    ApiResponseDto apiResponseDto = new ApiResponseDto();
    apiResponseDto.setTransactionDto(transactionDto);
    apiResponseDto.setAccountDto(accountDto);

    return apiResponseDto;
  }
}
