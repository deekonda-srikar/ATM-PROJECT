package com.codegnan.custom.Exceptions;

public class InsufficientMachineBalanceException extends Exception {
	public InsufficientMachineBalanceException(String errorMsg) {
		super(errorMsg);
	}

}