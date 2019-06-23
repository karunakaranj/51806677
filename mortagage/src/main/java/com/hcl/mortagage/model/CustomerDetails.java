package com.hcl.mortagage.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class CustomerDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long customerId;

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	private String name;

	private String mobile;

	private int age;

	private String gender;

	private String martialStatus;

	private int creditScore;

	@OneToMany(mappedBy = "customerDetails", cascade = CascadeType.ALL)
	private List<LoanDetails> loanDetailsList;

	public CustomerDetails() {
		// TODO Auto-generated constructor stub
	}

	

	public List<LoanDetails> getLoanDetailsList() {
		return loanDetailsList;
	}

	public void setLoanDetailsList(List<LoanDetails> loanDetailsList) {
		this.loanDetailsList = loanDetailsList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMartialStatus() {
		return martialStatus;
	}

	public void setMartialStatus(String martialStatus) {
		this.martialStatus = martialStatus;
	}

	public int getCreditScore() {
		return creditScore;
	}

	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}
	
	@Override
	public String toString() {
		return "CustomerDetails [customerId=" + customerId + ", name=" + name + ", mobile=" + mobile + ", age=" + age
				+ ", gender=" + gender + ", martialStatus=" + martialStatus + ", creditScore=" + creditScore
				+ ", loanDetailsList=" + loanDetailsList + "]";
	}

}
