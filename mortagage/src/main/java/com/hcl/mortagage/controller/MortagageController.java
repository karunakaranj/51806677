package com.hcl.mortagage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.mortagage.model.LoanDetails;
import com.hcl.mortagage.service.IMortagageService;

@RestController
@RequestMapping("/mortagage")
public class MortagageController {

	@Autowired
	IMortagageService iMortagageService;

//	@PostMapping(value = "/save")
//	public ResponseEntity<CustomerDetails> addCustomer(@RequestBody CustomerDetails customerDetails) {
//		return ResponseEntity.ok(iMortagageService.createCustomer(customerDetails));
//
//	}
	
	@PostMapping(value = "/save")
	public ResponseEntity<String> createLoan(@RequestBody LoanDetails loanDetails,@RequestParam Long customerId) {
		return ResponseEntity.ok(iMortagageService.createLoan(loanDetails,customerId));

	}

}
