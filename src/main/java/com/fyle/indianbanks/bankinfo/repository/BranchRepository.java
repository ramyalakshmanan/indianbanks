package com.fyle.indianbanks.bankinfo.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.fyle.indianbanks.bankinfo.dao.Branch;

public interface BranchRepository extends
		PagingAndSortingRepository<Branch, Long> {

	List<Branch> findByIfsc(String ifsc);

	List<Branch> findByCityAndBankName(String city, String bankName);

}
