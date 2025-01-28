package com.financtrsc.financialtransactions.entities;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

import com.financtrsc.financialtransactions.enums.TransactionInOutEnum;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_financtrans")
public class FinancTransaction implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "transactionId")
	private String transactionId;
	@Column(name = "typeTransaction")
	private String typeTransaction;
	@Column(name = "companyName")
	private String companyName;
	@Column(name = "transactionValue")
	private Double transactionValue;
	
	
	
	//empty constructor for Hibernate impl.
	public FinancTransaction() {
		
	}
	
	public FinancTransaction(String companyName, Double transactionValue) {
		this.transactionId = String.valueOf(UUID.randomUUID());
		this.typeTransaction = String.valueOf(verifyTypeTransaction(transactionValue));
		this.companyName = companyName;
		this.transactionValue = transactionValue;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(transactionId);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FinancTransaction other = (FinancTransaction) obj;
		return Objects.equals(transactionId, other.transactionId);
	}



	public String getTypeTransaction() {
		return typeTransaction;
	}

	public String getCompanyName() {
		return companyName;
	}



	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}



	public Double getTransactionValue() {
		return transactionValue;
	}



	public void setTransactionValue(Double transactionValue) {
		this.transactionValue = transactionValue;
	}



	public String getTransactionId() {
		return transactionId;
	}



	private TransactionInOutEnum verifyTypeTransaction(Double transactionValue) {
		if(transactionValue < 0.00 ) {
			return TransactionInOutEnum.Despesa;
		}
		else {
			return TransactionInOutEnum.Receita;
		}
	}
	
	
}