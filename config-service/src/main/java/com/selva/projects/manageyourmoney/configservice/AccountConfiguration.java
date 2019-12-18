package com.selva.projects.manageyourmoney.configservice;

public class AccountConfiguration {

	private boolean returnOpenAccountsOnly;
	private String accountIdMask;
	
	public boolean isReturnOpenAccountsOnly() {
		return returnOpenAccountsOnly;
	}
	public void setReturnOpenAccountsOnly(boolean returnOpenAccountsOnly) {
		this.returnOpenAccountsOnly = returnOpenAccountsOnly;
	}
	public String getAccountIdMask() {
		return accountIdMask;
	}
	public void setAccountIdMask(String accountIdMask) {
		this.accountIdMask = accountIdMask;
	}
	public AccountConfiguration(String accountIdMask, boolean returnOpenAccountsOnly) {
		super();
		this.accountIdMask = accountIdMask;
		this.returnOpenAccountsOnly = returnOpenAccountsOnly;
	}
	
	
}
