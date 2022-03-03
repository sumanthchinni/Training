package com.mt.exceptions;

public class SalaryException extends Exception {

	private static final long serialVersionUID=1L;
	SalaryException(){
		super();
	}
	SalaryException(String msg){
		super(msg);
	}
	public String toString() {
		return super.getMessage();
	}
	public String getMessage() {
		return super.getMessage();
	}
}
