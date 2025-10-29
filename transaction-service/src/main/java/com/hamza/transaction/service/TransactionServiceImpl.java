package com.hamza.transaction.service;

import org.springframework.stereotype.Service;
import com.hamza.transaction.dto.TransactionDto;
import com.hamza.transaction.entities.Transaction;
import com.hamza.transaction.repos.TransactionRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class TransactionServiceImpl implements TransactionService {
  private TransactionRepository transactionRepository;

  @Override
  public TransactionDto getTransactionById(Long id) {
    Transaction transaction = transactionRepository.findById(id).get();
    return new TransactionDto(
        transaction.getId(),
        transaction.getAccountNumber(),
        transaction.getAmount(),
        transaction.getDescription());
  }
}
