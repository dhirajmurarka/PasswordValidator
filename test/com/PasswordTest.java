package com;
import com.InvalidPasswordException;
import com.PasswordValidation;

public class PasswordTest {

	public static void main(String[] args) {
		PasswordValidation pv = new PasswordValidation();
		String password = "Abcd";
		try {
			pv.isValid(password);
		} catch (InvalidPasswordException e) {
			System.out.print(e.printMessage());
		}

	}

}
