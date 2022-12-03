package com;

public class InvalidPasswordException extends Exception {

	int condition = 0;

	public InvalidPasswordException(int conditionViolated) {
		super("Invalid Password: ");
		condition = conditionViolated;
	}
}