package com.fyle.indianbanks.bankinfo;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.isEmptyOrNullString;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.lang.reflect.Method;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.method.annotation.ExceptionHandlerMethodResolver;
import org.springframework.web.servlet.mvc.method.annotation.ExceptionHandlerExceptionResolver;
import org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod;

import com.fyle.indianbanks.bankinfo.dto.BankDTO;
import com.fyle.indianbanks.bankinfo.dto.BankDetailsDTO;
import com.fyle.indianbanks.bankinfo.dto.BranchDTO;

@RunWith(MockitoJUnitRunner.class)
public class BankControllerTest {

	private static final MediaType APPLICATION_JSON_UTF8 = new MediaType(
			MediaType.APPLICATION_JSON.getType(),
			MediaType.APPLICATION_JSON.getSubtype(), Charset.forName("utf8"));

	@Mock
	private BranchService service1;
	@Mock
	private BankService service;

	private MockMvc mockMvc;

	@Before
	public void setUp() {
		mockMvc = MockMvcBuilders.standaloneSetup(
				new BankController(service, service1))
		// .setHandlerExceptionResolvers(withExceptionControllerAdvice())
				.build();
	}

	@Test
	public void findByIfsc_BranchEntryFound_ShouldReturnResponseStatusOk()
			throws Exception {
		BankDetailsDTO found = new BankDetailsDTO();
		BranchDTO branch = new BranchDTO();
		branch.address = "ABHYUDAYA EDUCATION SOCIETY, OPP. BLDG. NO. 18, ABHYUDAYA NAGAR, KALACHOWKY, MUMBAI - 400033";
		branch.branch = "ABHYUDAYA NAGAR";
		branch.city = "MUMBAI";
		branch.district = "GREATER MUMBAI";
		branch.ifsc = "ABHY0065002";
		branch.state = "MAHARASHTRA";
		BankDTO bank = new BankDTO();
		bank.id = BigInteger.valueOf(60);
		bank.name = "ABHYUDAYA COOPERATIVE BANK LIMITED";
		found.bank = bank;
		found.branches = Arrays.asList(branch);

		when(service1.findByIfsc("ABHY0065002")).thenReturn(found);

		mockMvc.perform(
				get("/bankinfo/api/bank/branch").param("ifsc", "ABHY0065002")
						.accept(MediaType.APPLICATION_JSON)).andExpect(
				status().isOk());
	}
}
