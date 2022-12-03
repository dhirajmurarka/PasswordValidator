package com;
import com.InvalidPasswordException;
import com.PasswordValidation;

public class PasswordTestFeature3 {

	public static void main(String[] args) {
	
		char f3Passed=0;
		//Case 1.1
		PasswordValidation pv = new PasswordValidation();
		String password = "Abcd";
		try {
			f3Passed = pv.isValid(password,true).charAt(1);
		} catch (InvalidPasswordException e) {
			System.out.println(e.printMessage());
		}
		if (f3Passed == '1') {
			System.out.println("Password is OK for 3rd feature for input " + password );
		} else {
			System.out.println("Password is not OK for 3rd feature for input " + password);
		}
		
		//Case 1.2
		password = null;
		try {
			f3Passed = pv.isValid(password,true).charAt(1);
		} catch (InvalidPasswordException e) {
			System.out.println(e.printMessage());
		}
		if (f3Passed == '1') {
			System.out.println("Password is OK for 3rd feature for input " + password );
		} else {
			System.out.println("Password is not OK for 3rd feature for input " + password);
		}

		//Case 1.3
		password = "abcde";
		try {
			f3Passed = pv.isValid(password,true).charAt(1);
		} catch (InvalidPasswordException e) {
			System.out.println(e.printMessage());
		}
		if (f3Passed == '1') {
			System.out.println("Password is OK for 3rd feature for input " + password );
		} else {
			System.out.println("Password is not OK for 3rd feature for input " + password);
		}
		
		//Case 1.4
		password = "ABCDEFGHIJK";
		try {
			f3Passed = pv.isValid(password,true).charAt(1);
		} catch (InvalidPasswordException e) {
			System.out.println(e.printMessage());
		}		
		if (f3Passed == '1') {
			System.out.println("Password is OK for 3rd feature for input " + password );
		} else {
			System.out.println("Password is not OK for 3rd feature for input " + password);
		}

		//Case 1.5
		password = "AbcdEFGSFGHHFS";
		try {
			f3Passed = pv.isValid(password,true).charAt(1);
		} catch (InvalidPasswordException e) {
			System.out.println(e.printMessage());
		}
		if (f3Passed == '1') {
			System.out.println("Password is OK for 3rd feature for input " + password );
		} else {
			System.out.println("Password is not OK for 3rd feature for input " + password);
		}

		password = "Abcdefgh1";
		try {
			f3Passed = pv.isValid(password,true).charAt(1);
		} catch (InvalidPasswordException e) {
			System.out.println(e.printMessage());
		}
		if (f3Passed == '1') {
			System.out.println("Password is OK for 3rd feature for input " + password );
		} else {
			System.out.println("Password is not OK for 3rd feature for input " + password);
		}


	}

}
