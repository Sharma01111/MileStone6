package com.example.MileStone6.Exception;

public class UserNotFoundException extends RuntimeException {

	public UserNotFoundException(String message)
	{
		super(message);
	}
}
