package com.hcl.mortagage.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.mortagage.model.CustomerDetails;

public interface CustomerRepository extends JpaRepository<CustomerDetails, Long>{
	
	Optional<CustomerDetails> findByCustomerId(Long customerId);

}
