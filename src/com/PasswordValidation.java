package com;

public class PasswordValidation {

	public static void isValid(String password) throws InvalidPasswordException {
		if (password == null) {
			throw new InvalidPasswordException(2);
		}
		if (password.length() <= 8) {
			throw new InvalidPasswordException(1);
		}

		int count = 0;
		for (int i = 65; i <= 90; i++) {
			if (password.contains(Character.toString((char) i))) {
				count = 1;
			}
		}
		if (count == 0) {
			throw new InvalidPasswordException(3);
		}

		count = 0;
		for (int i = 90; i <= 122; i++) {
			String str1 = Character.toString((char) i);

			if (password.contains(str1)) {
				count = 1;
			}
		}
		if (count == 0) {
			throw new InvalidPasswordException(4);
		}

		count = 0;
		for (int i = 0; i <= 9; i++) {
			if (password.contains(Integer.toString(i))) {
				count = 1;
			}
		}
		if (count == 0) {
			throw new InvalidPasswordException(3);
		}

	}

	public static void main(String[] args) {
	}
}

