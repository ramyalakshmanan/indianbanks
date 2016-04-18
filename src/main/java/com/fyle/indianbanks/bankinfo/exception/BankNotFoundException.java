package com.fyle.indianbanks.bankinfo.exception;

public class BankNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BankNotFoundException(String id) {
		super(String.format("No Bank entry found with id: <%s>", id));
	}
}
