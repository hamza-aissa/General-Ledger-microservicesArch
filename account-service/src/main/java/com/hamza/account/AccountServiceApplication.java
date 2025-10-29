package com.hamza.account;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.hamza.account.entities.Account;
import com.hamza.account.repos.AccountRepository;

@SpringBootApplication
public class AccountServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(AccountServiceApplication.class, args);
  }

  @Bean
  CommandLineRunner commandLineRunner(AccountRepository accountRepository) {
    return args -> {
      accountRepository.save(Account.builder()
          .accountNumber("IT-001")
          .accountHolderName("Info Tech")
          .balance(1000f)
          .build());
      accountRepository.save(Account.builder()
          .accountNumber("MK-001")
          .accountHolderName("Marketing")
          .balance(2000f)
          .build());
    };
  }

}
