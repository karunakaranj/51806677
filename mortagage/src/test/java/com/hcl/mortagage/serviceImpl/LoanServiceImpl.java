package com.hcl.mortagage.serviceImpl;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.hcl.mortagage.model.CustomerDetails;
import com.hcl.mortagage.model.LoanDetails;
import com.hcl.mortagage.repository.LoanRepository;
import com.hcl.mortagage.service.MortagageServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class LoanServiceImpl {

	@InjectMocks
	MortagageServiceImpl mortagageServiceImpl;

	@Mock
	LoanRepository loanRepository;

	@Test
	public void createLoanTest() {
		LoanDetails loanDetails = getLoanDetails();
		//String message = "created  success";
		Long customerId = 3L;

		Mockito.when(loanRepository.save(loanDetails)).thenReturn(loanDetails);
		
		String actual=mortagageServiceImpl.createLoan(loanDetails, customerId);
		Assert.assertEquals("created  success",actual );

	}

	public LoanDetails getLoanDetails() {
		LoanDetails loanDetails = new LoanDetails();
		loanDetails.setId(1L);
		loanDetails.setApprovingManagerId(2L);
		loanDetails.setSecurityAddress("banglore");
		loanDetails.setLoanAccountNumber(1234L);
		loanDetails.setLoanAmount(200000);
		loanDetails.setLoanStatus(true);

		CustomerDetails customer = getCustomerDetails();
		loanDetails.setCustomerDetails(customer);

		return loanDetails;
	}

	public CustomerDetails getCustomerDetails() {
		CustomerDetails customerDetails = new CustomerDetails();
		customerDetails.setCustomerId(3L);
		return customerDetails;
	}

}
