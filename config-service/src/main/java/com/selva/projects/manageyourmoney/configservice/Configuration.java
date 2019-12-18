package com.selva.projects.manageyourmoney.configservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="account-service")
public class Configuration {
	
	private String idMaskPrefix;
	private boolean returnOpenAccountsOnly;
	public String getIdMaskPrefix() {
		return idMaskPrefix;
	}
	public void setIdMaskPrefix(String idMaskPrefix) {
		this.idMaskPrefix = idMaskPrefix;
	}
	public boolean isReturnOpenAccountsOnly() {
		return returnOpenAccountsOnly;
	}
	public void setReturnOpenAccountsOnly(boolean returnOpenAccountsOnly) {
		this.returnOpenAccountsOnly = returnOpenAccountsOnly;
	}
	

}
