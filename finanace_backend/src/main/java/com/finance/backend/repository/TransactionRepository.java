package com.finance.backend.repository;

import com.finance.backend.enums.TransactionType;
import com.finance.backend.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByType(TransactionType type);
    List<Transaction> findByCategory(String category);
    List<Transaction> findByDateBetween(LocalDate start, LocalDate end);
    List<Transaction> findByCreatedById(Long userId);
}
