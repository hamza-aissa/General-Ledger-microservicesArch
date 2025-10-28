package com.hamza.account.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hamza.account.entities.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
  Account findByAccountNumber(String number);
}
