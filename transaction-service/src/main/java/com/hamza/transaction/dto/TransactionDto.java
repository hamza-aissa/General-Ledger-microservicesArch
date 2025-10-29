package com.hamza.transaction.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionDto {
  private Long id;

  private String accountNumber;
  private Float amount;
  private String description;

}
