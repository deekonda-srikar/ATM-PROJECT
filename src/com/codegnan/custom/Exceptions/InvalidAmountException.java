package com.codegnan.custom.Exceptions;

public class InvalidAmountException extends Exception {
	public InvalidAmountException(String errorMsg) {
		super(errorMsg);
	}

}