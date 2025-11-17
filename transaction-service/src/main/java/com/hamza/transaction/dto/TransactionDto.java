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
  private String accountHolderName; // NEW FIELD

  // Getters
  public Long getId() {
    return id;
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public Float getAmount() {
    return amount;
  }

  public String getDescription() {
    return description;
  }

  public String getAccountHolderName() {
    return accountHolderName;
  }

  // Setters
  public void setId(Long id) {
    this.id = id;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public void setAmount(Float amount) {
    this.amount = amount;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setAccountHolderName(String accountHolderName) {
    this.accountHolderName = accountHolderName;
  }
}
