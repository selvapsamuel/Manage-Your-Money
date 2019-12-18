package com.selva.projects.manageyourmoney.accountservice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class AccountService {

	public Account getAccount(String bankId, String userId, String accountId) {

		Account account = new Account("123", AccountType.CHECKING, Ownership.PRIMARY, new BigDecimal(10000),
				AccountStatus.OPEN);
		return account;
	}
	
	public List<Account> getAccounts(String bankId, String userId) {

		Account account1 = new Account("123", AccountType.CHECKING, Ownership.PRIMARY, new BigDecimal(10000),
				AccountStatus.OPEN);
		Account account2 = new Account("456", AccountType.SAVINGS, Ownership.JOINT, new BigDecimal(20000),
				AccountStatus.CLOSED);
		Account account3 = new Account("789", AccountType.MONEY_MARKET, Ownership.PRIMARY, new BigDecimal(30000),
				AccountStatus.ON_HOLD);
		Account account4 = new Account("234", AccountType.CREDIT, Ownership.JOINT, new BigDecimal(40000),
				AccountStatus.OPEN);
		
		List<Account> accounts = new ArrayList<>();
		accounts.add(account1);
		accounts.add(account2);
		accounts.add(account3);
		accounts.add(account4);
		return accounts;
	}
	
	private List<Account> filterAccount(List<Account> accounts) {
		return null;
	}
	
	private List<Account> maskAccount(List<Account> accounts) {
		return null;
	}
}
