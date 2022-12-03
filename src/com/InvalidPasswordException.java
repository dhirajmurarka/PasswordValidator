package com;

public class InvalidPasswordException extends Exception {

	int condition = 0;

	public InvalidPasswordException(int conditionViolated) {
		super("Invalid Password: ");
		condition = conditionViolated;
	}

	public String printMessage() {

		switch (condition) {

		case 2:
			return ("password should not be null");

		case 1:
			return ("password should be larger than 8 chars");

		case 3:
			return ("password should have one uppercase letter at least");

		case 4:
			return ("password should have one lowercase letter at least");

		case 5:
			return ("password should have one number at least");

		}

		return ("");
	}
}