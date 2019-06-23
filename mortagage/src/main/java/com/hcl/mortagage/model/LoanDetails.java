package com.hcl.mortagage.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LoanDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private double loanAccountNumber;
	private String securityAddress;
	private boolean loanStatus;
	private double loanAmount;
	private Long approvingManagerId;
	
//	@OneToOne(cascade =  CascadeType.ALL,
//            mappedBy = "user")
//	private BankOfficerDetails bankOfficerDetails;

	@ManyToOne
	@JoinColumn(name = "customerId")
	private CustomerDetails customerDetails;

	public CustomerDetails getCustomerDetails() {
		return customerDetails;
	}

	public void setCustomerDetails(CustomerDetails customerDetails) {
		this.customerDetails = customerDetails;
	}

	public LoanDetails() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

//	public BankOfficerDetails getBankOfficerDetails() {
//		return bankOfficerDetails;
//	}
//
//	public void setBankOfficerDetails(BankOfficerDetails bankOfficerDetails) {
//		this.bankOfficerDetails = bankOfficerDetails;
//	}

	public Long getApprovingManagerId() {
		return approvingManagerId;
	}

	public void setApprovingManagerId(Long approvingManagerId) {
		this.approvingManagerId = approvingManagerId;
	}

	

}
