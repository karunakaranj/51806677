package com.hcl.mortagage.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContextException;
import org.springframework.stereotype.Service;

import com.hcl.mortagage.dto.ApprovalRequestDto;
import com.hcl.mortagage.exception.ApplicationException;
import com.hcl.mortagage.model.CustomerDetails;
import com.hcl.mortagage.model.LoanDetails;
import com.hcl.mortagage.repository.CustomerRepository;
import com.hcl.mortagage.repository.LoanRepository;

@Service
public class MortagageServiceImpl implements IMortagageService {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	LoanRepository loanRepository;



	@Override
	public String createLoan(LoanDetails loanDetails, Long customerId) {
		try {
			Optional<CustomerDetails> customer = customerRepository.findByCustomerId(customerId);
			if (customer.isPresent()) {
				CustomerDetails customerDetails = new CustomerDetails();
				customerDetails.setCustomerId(customerId);
				loanDetails.setCustomerDetails(customerDetails);
				loanRepository.save(loanDetails);
				return "created  success";
			} else {
				throw new ApplicationException("Customer not found");
			}
		} catch (Exception e) {
			throw new ApplicationContextException(e.getMessage());
		}

	}
	
	

	@Override
	public String approvLoan(ApprovalRequestDto loanRequestDto) {
		
		LoanDetails loanDetails=null;

		try {

		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

}
