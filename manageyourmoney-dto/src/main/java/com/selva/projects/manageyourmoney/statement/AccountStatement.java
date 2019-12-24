package com.selva.projects.manageyourmoney.statement;

import java.util.List;

public class AccountStatement {

	private String accountId;
	private String startString;
	private String endString;
	private List<Transaction> transactions;
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getStartDate() {
		return startString;
	}
	public void setStartDate(String startString) {
		this.startString = startString;
	}
	public String getEndDate() {
		return endString;
	}
	public void setEndDate(String endString) {
		this.endString = endString;
	}
	public List<Transaction> getTransactions() {
		return transactions;
	}
	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}
	
	
}
