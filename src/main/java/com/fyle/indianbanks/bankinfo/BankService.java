package com.fyle.indianbanks.bankinfo;

import java.math.BigInteger;

import com.fyle.indianbanks.bankinfo.dto.BankDTO;


interface BankService {

    BankDTO findById(BigInteger id);
}
