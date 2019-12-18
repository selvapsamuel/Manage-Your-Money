package com.selva.projects.manageyourmoney.configservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

	@Autowired
	private ConfigService configService;

	@GetMapping("/account-configs")
	public AccountConfiguration getAccountConfigs() {
		return new AccountConfiguration(configService.getAccointIdMaskPrefix(),
				configService.isReturnOpenAccountsOnly());

	}

}
