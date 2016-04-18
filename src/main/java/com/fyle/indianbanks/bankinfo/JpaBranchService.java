package com.fyle.indianbanks.bankinfo;

import static java.util.stream.Collectors.toList;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fyle.indianbanks.bankinfo.dao.Branch;
import com.fyle.indianbanks.bankinfo.dto.BankDTO;
import com.fyle.indianbanks.bankinfo.dto.BankDetailsDTO;
import com.fyle.indianbanks.bankinfo.dto.BranchDTO;
import com.fyle.indianbanks.bankinfo.exception.BranchNotFoundException;
import com.fyle.indianbanks.bankinfo.repository.BranchRepository;

@Service
final class JpaBranchService implements BranchService {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(JpaBranchService.class);

	private final BranchRepository repository;

	@Autowired
	JpaBranchService(BranchRepository repository) {
		this.repository = repository;
	}

	@Override
	public BankDetailsDTO findByIfsc(String ifsc) {
		LOGGER.info("Finding Branch entry with id: {}", ifsc);
		return findBranchByIfsc(ifsc);
	}

	private BankDetailsDTO findBranchByIfsc(String ifsc) {
		List<Branch> result = repository.findByIfsc(ifsc);
		if (!(result.size() > 0)) {
			throw new BranchNotFoundException(ifsc);
		}
		return convertToDTOs(result);
	}

	private BranchDTO convertToDTO(Branch model) {
		BranchDTO dto = new BranchDTO();
		dto.address = model.address;
		dto.city = model.city;
		dto.branch = model.branch;
		dto.district = model.district;
		dto.ifsc = model.ifsc;
		dto.state = model.state;
		return dto;
	}

	@Override
	public BankDetailsDTO findByBankNameAndCity(String bankName, String city) {
		LOGGER.info("Finding Branch entry with bank name:", bankName
				+ " and City " + city);
		List<Branch> branches = repository
				.findByCityAndBankName(city, bankName);
		LOGGER.info("Found Branches of size: {}" + branches.size());
		if (branches.size() <= Integer.MIN_VALUE) {
			throw new BranchNotFoundException(bankName + "in" + city);
		}
		return convertToDTOs(branches);
	}

	private BankDetailsDTO convertToDTOs(List<Branch> models) {
		BankDetailsDTO bankDetails = new BankDetailsDTO();
		BankDTO bank = new BankDTO();
		bank.id = models.get(0).bank.id;
		bank.name = models.get(0).bank.name;
		bankDetails.bank = bank;
		bankDetails.branches = models.stream().map(this::convertToDTO)
				.collect(toList());
		return bankDetails;
	}
}
