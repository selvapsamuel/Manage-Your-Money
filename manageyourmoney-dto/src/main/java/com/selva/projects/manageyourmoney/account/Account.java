package com.selva.projects.manageyourmoney.account;

import java.math.BigDecimal;

public class Account {

	private String accountId;
	private AccountType accountType;
	private Ownership ownership;
	private BigDecimal balance;
	private AccountStatus status;
	
	
	public Account(String accountId, AccountType accountType, Ownership ownership, BigDecimal balance,
			AccountStatus status) {
		super();
		this.accountId = accountId;
		this.accountType = accountType;
		this.ownership = ownership;
		this.balance = balance;
		this.status = status;
	}
	public AccountStatus getStatus() {
		return status;
	}
	public void setStatus(AccountStatus status) {
		this.status = status;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public AccountType getAccountType() {
		return accountType;
	}
	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}
	public Ownership getOwnership() {
		return ownership;
	}
	public void setOwnership(Ownership ownership) {
		this.ownership = ownership;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", accountType=" + accountType + ", ownership=" + ownership
				+ ", balance=" + balance + "]";
	}
	
	
	
}
