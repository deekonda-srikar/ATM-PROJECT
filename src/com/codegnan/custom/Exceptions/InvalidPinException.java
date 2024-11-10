package com.codegnan.custom.Exceptions;

public class InvalidPinException extends Exception {
	public InvalidPinException(String errorMsg) {
		super(errorMsg);
	}

}