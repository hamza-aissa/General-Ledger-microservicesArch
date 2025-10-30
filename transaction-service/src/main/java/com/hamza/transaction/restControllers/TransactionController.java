package com.hamza.transaction.restControllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hamza.transaction.dto.ApiResponseDto;
import com.hamza.transaction.service.TransactionService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

  private TransactionService transactionService;

  @GetMapping("{id}")
  public ResponseEntity<ApiResponseDto> getTransactionById(@PathVariable("id") Long id) {
    return new ResponseEntity<ApiResponseDto>(transactionService.getTransactionById(id), HttpStatus.OK);
  }

}
