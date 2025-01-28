package com.financtrsc.financialtransactions;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import com.financtrsc.financialtransactions.entities.FinancTransaction;
import com.financtrsc.financialtransactions.repositories.FinancTransactionsRepository;
import com.financtrsc.financialtransactions.services.FinancTransactionsService;

//implements CommandLineRunner

@SpringBootApplication
public class FinancialtransactionsApplication {

	@Autowired
	FinancTransactionsService financTrans;
	
	@Autowired
	FinancTransactionsRepository finRep;
	
	public static void main(String[] args) {
		SpringApplication.run(FinancialtransactionsApplication.class, args);
	}

	/*@Override
	public void run(String... args) throws Exception {
		FinancTransaction trans = new FinancTransaction("TREVISOL", 998.0);
		finRep.save(trans);
	}*/
	
	

}
