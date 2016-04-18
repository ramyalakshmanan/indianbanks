package com.fyle.indianbanks.bankinfo;

import java.math.BigInteger;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fyle.indianbanks.bankinfo.dao.Bank;
import com.fyle.indianbanks.bankinfo.dto.BankDTO;
import com.fyle.indianbanks.bankinfo.exception.BankNotFoundException;
import com.fyle.indianbanks.bankinfo.repository.BankRepository;

@Service
final class JpaBankService implements BankService {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(JpaBankService.class);

	private final BankRepository repository;

	@Autowired
	JpaBankService(BankRepository repository) {
		this.repository = repository;
	}

	@Override
	public BankDTO findById(BigInteger id) {
		LOGGER.info("Finding Bank entry with id: {}", id);
		Bank found = findBankById(id);
		LOGGER.info("Found Bank entry: {}", found);
		return convertToDTO(found);
	}

	private Bank findBankById(BigInteger id) {
		Optional<Bank> result = repository.findById(id);
		return result.orElseThrow(() -> new BankNotFoundException(String
				.valueOf(id)));
	}

	private BankDTO convertToDTO(Bank model) {
		BankDTO dto = new BankDTO();
		dto.id = model.id;
		dto.name = model.name;
		return dto;
	}
}
