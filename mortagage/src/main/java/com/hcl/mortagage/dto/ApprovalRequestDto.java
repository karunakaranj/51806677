package com.hcl.mortagage.dto;

public class ApprovalRequestDto {

	private Long managerId;
	private Long loanId;
	public Long getManagerId() {
		return managerId;
	}
	public void setManagerId(Long managerId) {
		this.managerId = managerId;
	}
	public Long getLoanId() {
		return loanId;
	}
	public void setLoanId(Long loanId) {
		this.loanId = loanId;
	}

}
