package com.hcl.mortagage.service;

import com.hcl.mortagage.dto.ApprovalRequestDto;
import com.hcl.mortagage.model.LoanDetails;

public interface IMortagageService {
	
	
	String createLoan(LoanDetails loanDetails,Long customerId);
	

	String approvLoan(ApprovalRequestDto loanRequestDto);
	

}
