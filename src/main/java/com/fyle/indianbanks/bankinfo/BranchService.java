package com.fyle.indianbanks.bankinfo;

import com.fyle.indianbanks.bankinfo.dto.BankDetailsDTO;


interface BranchService {

	BankDetailsDTO findByIfsc(String ifsc);

	BankDetailsDTO findByBankNameAndCity(String bankName, String city);
}
