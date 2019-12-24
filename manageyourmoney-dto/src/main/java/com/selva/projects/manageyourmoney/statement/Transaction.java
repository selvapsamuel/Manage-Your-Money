package com.selva.projects.manageyourmoney.statement;

import java.math.BigDecimal;
import java.util.Date;

public class Transaction {

	private String transactionId;
	private Date transactionDate;
	private TransactionType transactionType;
	private BigDecimal tranactionAmount;
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public TransactionType getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(TransactionType transactionType) {
		this.transactionType = transactionType;
	}
	public BigDecimal getTranactionAmount() {
		return tranactionAmount;
	}
	public void setTranactionAmount(BigDecimal tranactionAmount) {
		this.tranactionAmount = tranactionAmount;
	}
	
	
}
