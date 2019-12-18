package com.selva.projects.manageyourmoney.configservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConfigService {
	
	@Autowired
	private Configuration configuration;

	public String getAccointIdMaskPrefix() {

		return configuration.getIdMaskPrefix();
	}
	
	public boolean isReturnOpenAccountsOnly() {
		return configuration.isReturnOpenAccountsOnly();
	}
}
