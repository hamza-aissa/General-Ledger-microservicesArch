package com.hamza.transaction;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

import com.hamza.transaction.entities.Transaction;
import com.hamza.transaction.repos.TransactionRepository;

@SpringBootApplication
public class TransactionServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(TransactionServiceApplication.class, args);
  }

  @Bean
  CommandLineRunner commandLineRunner(TransactionRepository transactionRepository) {
    return args -> {
      transactionRepository
          .save(Transaction.builder().accountNumber("IT-001").amount(544f).description("random acoount")
              .build());
    };

  }

  @Bean
  public WebClient webClient() {
    return WebClient.builder().build();
  }
}
