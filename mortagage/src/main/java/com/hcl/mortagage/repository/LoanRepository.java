package com.hcl.mortagage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.mortagage.model.LoanDetails;

public interface LoanRepository extends JpaRepository<LoanDetails, Long>{

}
