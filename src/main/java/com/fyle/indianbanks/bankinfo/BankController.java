package com.fyle.indianbanks.bankinfo;

import java.math.BigInteger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fyle.indianbanks.bankinfo.dto.BankDTO;
import com.fyle.indianbanks.bankinfo.dto.BankDetailsDTO;

@RestController
@RequestMapping("/bank")
public class BankController {
	private static final Logger LOGGER = LoggerFactory
			.getLogger(BankController.class);
	private final BankService service;
	private final BranchService branchService;

	@Autowired
	BankController(BankService service, BranchService branchService) {
		this.service = service;
		this.branchService = branchService;
	}

	// http://localhost:8080/bankinfo/api/bank/1
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	BankDTO findById(@PathVariable("id") String id) {
		LOGGER.info("Finding bank with id: {}", id);
		BankDTO bankEntry = service.findById(new BigInteger(id));
		LOGGER.info("Found bank entry with information: {}", bankEntry);
		return bankEntry;
	}

	@RequestMapping(value = "/branch", method = RequestMethod.GET)
	BankDetailsDTO findByIfsc(@RequestParam("ifsc") String ifsc) {
		LOGGER.info("Finding bank branch with ifsc: {}", ifsc);
		return branchService.findByIfsc(ifsc);
	}

	@RequestMapping(value = "/branchList", method = RequestMethod.GET)
	BankDetailsDTO findByCityAndBankName(
			@RequestParam("bankName") String bankName,
			@RequestParam("city") String city) {
		LOGGER.info("Finding bank branch with bank name: {}", bankName
				+ " city :" + city);
		BankDetailsDTO bankDetails = branchService.findByBankNameAndCity(
				bankName, city);
		System.out.println(bankDetails);
		return bankDetails;
	}

}
