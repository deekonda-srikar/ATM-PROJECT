package com.codegnan.custom.Exceptions;

public class IncorrectPinLimitReachException extends Exception {
	public IncorrectPinLimitReachException(String errorMsg) {
		super(errorMsg);
	}

}