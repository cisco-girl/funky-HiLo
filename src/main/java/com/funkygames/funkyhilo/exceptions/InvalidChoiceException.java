package com.funkygames.funkyhilo.exceptions;

public class InvalidChoiceException extends Exception {

	public InvalidChoiceException(String usersChoice) {
		super(" \" " + usersChoice + "\" is not a valid choice");
		
	}

}
