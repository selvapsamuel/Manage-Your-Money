package com.selva.projects.manageyourmoney.statementservice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.selva.projects.manageyourmoney.account.Account;
import com.selva.projects.manageyourmoney.statement.AccountStatement;
import com.selva.projects.manageyourmoney.statement.Transaction;
import com.selva.projects.manageyourmoney.statement.TransactionType;

@Service
public class StatementService {
	
	@Autowired
	private AccountServiceProxy proxy;
	
	public AccountStatement getStatement( String bankId,  String userId,
			 String accountId,  String startDate,  String endDate) {
		
		ResponseEntity<Account> responseEntity = proxy.getAccount(bankId, userId, accountId);
		
		Account account = responseEntity.getBody();
		System.out.println("Account retrieved by Feign is: "+account);
		System.out.println("Account retrieved from port: "+responseEntity.getHeaders().getFirst("Server-Port"));
		
		AccountStatement statement = new AccountStatement();
		
		Transaction transaction1= new Transaction();
		transaction1.setTransactionId("1");
		transaction1.setTransactionType(TransactionType.ATM_FEE);
		transaction1.setTransactionDate(new Date());
		transaction1.setTranactionAmount(new BigDecimal(123));
		
		Transaction transaction2= new Transaction();
		transaction2.setTransactionId("2");
		transaction2.setTransactionType(TransactionType.DEBIT);
		transaction2.setTransactionDate(new Date());
		transaction2.setTranactionAmount(new BigDecimal(234));
		
		Transaction transaction3= new Transaction();
		transaction3.setTransactionId("3");
		transaction3.setTransactionType(TransactionType.CREDIT);
		transaction3.setTransactionDate(new Date());
		transaction3.setTranactionAmount(new BigDecimal(8787));
		
		Transaction transaction4= new Transaction();
		transaction4.setTransactionId("4");
		transaction4.setTransactionType(TransactionType.LATE_FEE);
		transaction4.setTransactionDate(new Date());
		transaction4.setTranactionAmount(new BigDecimal(5));
		
		List<Transaction> transactions = new ArrayList<>();
		transactions.add(transaction1);
		transactions.add(transaction2);
		transactions.add(transaction3);
		transactions.add(transaction4);
		
		statement.setAccountId(accountId);
		statement.setStartDate(startDate);
		statement.setEndDate(endDate);

		statement.setTransactions(transactions );
		
		return statement;
		

	}

}
