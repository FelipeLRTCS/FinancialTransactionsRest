package com.financtrsc.financialtransactions.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.financtrsc.financialtransactions.entities.FinancTransaction;
import com.financtrsc.financialtransactions.repositories.FinancTransactionsRepository;

@Service
public class FinancTransactionsService{
	
	@Autowired
	private FinancTransactionsRepository finRep;
	
	public void insertTransaction(FinancTransaction transaction){
		finRep.save(transaction);
	}
	
	public List<FinancTransaction> seeAllTransactions(){
		return finRep.findAll();
	}
	
	public void deleteTransaction(String id) {
		finRep.deleteById(id);
	}
	
	public Optional<FinancTransaction> findById(String id) {
		return finRep.findById(id);
	}
	
}