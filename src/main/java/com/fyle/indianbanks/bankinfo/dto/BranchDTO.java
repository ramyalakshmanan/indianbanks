package com.fyle.indianbanks.bankinfo.dto;

import java.math.BigInteger;

import lombok.Data;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Data
public class BranchDTO {
	@NotEmpty
	public String ifsc;
	@JsonIgnore
	public BigInteger bankId;
	public String branch;
	public String address;
	public String city;
	public String district;
	public String state;
}
