package com.financtrsc.financialtransactions.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.financtrsc.financialtransactions.entities.FinancTransaction;

@Repository
public interface FinancTransactionsRepository extends JpaRepository<FinancTransaction, String>{
	
}