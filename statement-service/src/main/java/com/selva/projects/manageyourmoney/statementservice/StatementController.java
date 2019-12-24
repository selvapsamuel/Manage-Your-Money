package com.selva.projects.manageyourmoney.statementservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.selva.projects.manageyourmoney.statement.AccountStatement;

@RestController
public class StatementController {

	@Autowired
	private StatementService service;

	@GetMapping("/bankId/{bankId}/userId/{userId}/accountId/{accountId}/statement")
	public AccountStatement getStatement(@PathVariable String bankId, @PathVariable String userId,
			@PathVariable String accountId, @RequestParam String startDate, @RequestParam String endDate) {

		return service.getStatement(bankId, userId, accountId, startDate, endDate);
	}
	
}
