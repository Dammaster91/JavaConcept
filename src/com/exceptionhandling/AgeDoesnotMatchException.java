package com.exceptionhandling;

/**
 * @author 10690498
 * Custom Exception
 */
public class AgeDoesnotMatchException extends Exception {

	private static final long serialVersionUID = 1L;

	public AgeDoesnotMatchException(String msg) {
		super(msg);
	}

}
