package com;
import com.InvalidPasswordException;
import com.PasswordValidation;

public class PasswordTest {

	public static void main(String[] args) {
		
		//Case 1.1
		PasswordValidation pv = new PasswordValidation();
		String password = "Abcd";
		try {
			pv.isValid(password,false);
		} catch (InvalidPasswordException e) {
			System.out.println(e.printMessage());
		}
		
		//Case 1.2
		password = null;
		try {
			pv.isValid(password,false);
		} catch (InvalidPasswordException e) {
			System.out.println(e.printMessage());
		}

		//Case 1.3
		password = "abcdefghijk";
		try {
			pv.isValid(password,false);
		} catch (InvalidPasswordException e) {
			System.out.println(e.printMessage());
		}

		//Case 1.4
		password = "ABCDEFGHIJK";
		try {
			pv.isValid(password,false);
		} catch (InvalidPasswordException e) {
			System.out.println(e.printMessage());
		}

		//Case 1.5
		password = "AbcdEFGSFGHHFS";
		try {
			pv.isValid(password,false);
		} catch (InvalidPasswordException e) {
			System.out.println(e.printMessage());
		}

		password = "Abcdefgh1";
		try {
			pv.isValid(password,false);
			System.out.println("Password is OK");
		} catch (InvalidPasswordException e) {
			System.out.println(e.printMessage());
		}


	}

}
