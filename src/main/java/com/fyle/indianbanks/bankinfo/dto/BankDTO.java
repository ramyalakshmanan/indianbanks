package com.fyle.indianbanks.bankinfo.dto;

import java.math.BigInteger;

import lombok.Data;

import org.hibernate.validator.constraints.NotEmpty;

@Data
public class BankDTO {
	@NotEmpty
	public BigInteger id;
	@NotEmpty
	public String name;
}
