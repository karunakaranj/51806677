package com.hcl.mortagage.dto;

public class LoanRequestDto {

	private Long customerId;
	private double loanAccountNumber;
	private String securityAddress;
	private boolean loanStatus;
	private double loanAmount;

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public double getLoanAccountNumber() {
		return loanAccountNumber;
	}

	public void setLoanAccountNumber(double loanAccountNumber) {
		this.loanAccountNumber = loanAccountNumber;
	}

	public String getSecurityAddress() {
		return securityAddress;
	}

	public void setSecurityAddress(String securityAddress) {
		this.securityAddress = securityAddress;
	}

	public boolean isLoanStatus() {
		return loanStatus;
	}

	public void setLoanStatus(boolean loanStatus) {
		this.loanStatus = loanStatus;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

}
