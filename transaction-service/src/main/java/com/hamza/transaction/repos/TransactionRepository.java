package com.hamza.transaction.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hamza.transaction.entities.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
