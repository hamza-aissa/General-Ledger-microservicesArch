package com.hamza.transaction.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountDto {
  private Long id;
  private String accountNumber;
  private String accountHolderName;
  private Float balance;

}
