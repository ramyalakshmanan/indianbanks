package com.fyle.indianbanks.bankinfo.dto;

import java.util.List;

import lombok.Data;

@Data
public final class BankDetailsDTO {

	public BankDTO bank;
	
	public List<BranchDTO> branches;
}
