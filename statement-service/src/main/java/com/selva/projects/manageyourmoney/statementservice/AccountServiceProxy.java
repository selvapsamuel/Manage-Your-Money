package com.selva.projects.manageyourmoney.statementservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.selva.projects.manageyourmoney.account.Account;

@FeignClient(name="api-gateway")
@RibbonClient(name="account-service")
public interface AccountServiceProxy {

	@GetMapping("/account-service/bank/{bankId}/users/{userId}/accounts/{accountId}")
	public ResponseEntity<Account> getAccount(@PathVariable("bankId") String bankId, @PathVariable("userId") String userId,
			@PathVariable("accountId") String accountId);
}
