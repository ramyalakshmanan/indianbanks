package com.fyle.indianbanks.bankinfo.exception;

public class BranchNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BranchNotFoundException(String ifsc) {
		super(String.format("No Branch entry found with ifsc: <%s>", ifsc));
	}
}
