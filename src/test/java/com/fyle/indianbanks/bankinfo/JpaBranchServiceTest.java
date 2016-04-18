package com.fyle.indianbanks.bankinfo;

import static org.mockito.Mockito.when;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.fyle.indianbanks.bankinfo.dao.Bank;
import com.fyle.indianbanks.bankinfo.dao.Branch;
import com.fyle.indianbanks.bankinfo.dto.BankDetailsDTO;
import com.fyle.indianbanks.bankinfo.dto.BranchDTO;
import com.fyle.indianbanks.bankinfo.exception.BranchNotFoundException;
import com.fyle.indianbanks.bankinfo.repository.BranchRepository;

@RunWith(MockitoJUnitRunner.class)
public class JpaBranchServiceTest {

	@Mock
	private BranchRepository repository;

	private JpaBranchService service;

	@Before
	public void setUp() {
		this.service = new JpaBranchService(repository);
	}

	@Test
	public void findByIfsc_BranchEntryFound_ShouldReturnEntry() {
		Branch found = new Branch();
		found.address = "ABHYUDAYA EDUCATION SOCIETY, OPP. BLDG. NO. 18, ABHYUDAYA NAGAR, KALACHOWKY, MUMBAI - 400033";
		found.branch = "ABHYUDAYA NAGAR";
		found.city = "MUMBAI";
		found.district = "GREATER MUMBAI";
		found.ifsc = "ABHY0065002";
		found.state = "MAHARASHTRA";
		Bank bank = new Bank();
		bank.id = BigInteger.valueOf(60);
		bank.name = "ABHYUDAYA COOPERATIVE BANK LIMITED";
		found.bank = bank;
		when(repository.findByIfsc("ABHY0065002")).thenReturn(
				Arrays.asList(found));
		BankDetailsDTO returned = service.findByIfsc("ABHY0065002");
		Assert.assertEquals(1, returned.branches.size());

		BranchDTO branch = returned.branches.get(0);
		Assert.assertEquals(found.address, branch.address);
		Assert.assertEquals(found.branch, branch.branch);
		Assert.assertEquals(found.city, branch.city);
		Assert.assertEquals(found.district, branch.district);
		Assert.assertEquals(found.ifsc, branch.ifsc);
		Assert.assertEquals(found.state, branch.state);
		Assert.assertEquals(found.bank.id, returned.bank.id);
		Assert.assertEquals(found.bank.name, returned.bank.name);

	}

	@Test(expected = BranchNotFoundException.class)
	public void findByIfsc_BranchEntryNotFound_ShouldThrowException() {

		when(repository.findByIfsc("ABHY10002")).thenReturn(
				new ArrayList<Branch>());
		service.findByIfsc("ABHY10002");
	}

	@Test(expected = BranchNotFoundException.class)
	public void findByCityAndBankName_BranchEntryNotFound_ShouldThrowException() {

		when(
				repository.findByCityAndBankName(
						"ABHYUDAYA COOPERATIVE BANK LIMITED", "MUMBAI"))
				.thenReturn(Arrays.asList());
		service.findByIfsc("ABHY10002");
	}

	@Test
	public void findByCityAndBankName_BranchEntryFound_ShouldReturnTheInformationOfFoundBranchEntry() {
		Branch found = new Branch();
		found.address = "ABHYUDAYA EDUCATION SOCIETY, OPP. BLDG. NO. 18, ABHYUDAYA NAGAR, KALACHOWKY, MUMBAI - 400033";
		found.branch = "ABHYUDAYA NAGAR";
		found.city = "MUMBAI";
		found.district = "GREATER MUMBAI";
		found.ifsc = "ABHY0065002";
		found.state = "MAHARASHTRA";
		Bank bank = new Bank();
		bank.id = BigInteger.valueOf(60);
		bank.name = "ABHYUDAYA COOPERATIVE BANK LIMITED";
		found.bank = bank;
		when(
				repository.findByCityAndBankName(
						"ABHYUDAYA COOPERATIVE BANK LIMITED", "MUMBAI"))
				.thenReturn(Arrays.asList(found));

		BankDetailsDTO returned = service.findByBankNameAndCity("MUMBAI",
				"ABHYUDAYA COOPERATIVE BANK LIMITED");

		Assert.assertEquals(1, returned.branches.size());

		BranchDTO branch = returned.branches.get(0);
		Assert.assertEquals(found.address, branch.address);
		Assert.assertEquals(found.branch, branch.branch);
		Assert.assertEquals(found.city, branch.city);
		Assert.assertEquals(found.district, branch.district);
		Assert.assertEquals(found.ifsc, branch.ifsc);
		Assert.assertEquals(found.state, branch.state);
		Assert.assertEquals(found.bank.id, returned.bank.id);
		Assert.assertEquals(found.bank.name, returned.bank.name);

	}
}
