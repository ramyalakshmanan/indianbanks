package com.fyle.indianbanks.bankinfo.repository;

import java.math.BigInteger;
import java.util.Optional;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.fyle.indianbanks.bankinfo.dao.Bank;

public interface BankRepository extends PagingAndSortingRepository<Bank, Long> {

	Optional<Bank> findById(BigInteger id);

}