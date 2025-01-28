package com.financtrsc.financialtransactions.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.financtrsc.financialtransactions.entities.FinancTransaction;
import com.financtrsc.financialtransactions.services.FinancTransactionsService;

@RestController
@RequestMapping("/Transaction")
public class TransactionController{
	
	@Autowired
	private FinancTransactionsService finTransSer;
	
	
	@GetMapping("/allTransactions")
	public List<FinancTransaction> findAll(){
		List<FinancTransaction> list = finTransSer.seeAllTransactions();
		return list;
	}
	
	@GetMapping("/findById/{id}")
	public Optional<FinancTransaction> findById(@PathVariable String id){
		return finTransSer.findById(id);
	}
	
	
	@DeleteMapping("/deleteTransaction/{id}")
	public ResponseEntity<FinancTransaction> deleteById(@PathVariable String id) {
		if(id == null) {
			return ResponseEntity.badRequest().body(null);
		}
		finTransSer.deleteTransaction(id);
		return ResponseEntity.ok().body(null);
	}
	
}