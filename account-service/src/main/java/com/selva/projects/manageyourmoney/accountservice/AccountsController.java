package com.selva.projects.manageyourmoney.accountservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsController {
	
	@Autowired
	private AccountService accountService;

	@GetMapping("/bank/{bankId}/users/{userId}/accounts/{accountId}")
	public Account getAccount(@PathVariable String bankId, @PathVariable String userId,
			@PathVariable String accountId) {

		return accountService.getAccount(bankId,userId,accountId);
	}
	
	@GetMapping("/bank/{bankId}/users/{userId}")
	public List<Account> getAccounts(@PathVariable String bankId, @PathVariable String userId) {

		return accountService.getAccounts(bankId,userId);
	}
	
}
