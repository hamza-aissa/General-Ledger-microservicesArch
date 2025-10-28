package com.hamza.transaction.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "transactions")
public class Transaction {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long transactionId;

  private String accountNumber;

  private BigDecimal amount;

  private TransactionType type;

  private TransactionStatus status;

  private String description;

  private BigDecimal balanceAfter;

  private LocalDateTime transactionDate;

}

enum TransactionType {
  DEPOSIT,
  WITHDRAWAL,
  TRANSFER_IN,
  TRANSFER_OUT
}

enum TransactionStatus {
  PENDING,
  COMPLETED,
  FAILED,
  CANCELLED
}
