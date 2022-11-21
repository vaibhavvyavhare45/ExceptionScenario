package com.prowing.customexception;

public class AgeInvalidException extends Exception{
	
	public AgeInvalidException() {
		super();
	}
AgeInvalidException(String message){
	super(message);
}
}
