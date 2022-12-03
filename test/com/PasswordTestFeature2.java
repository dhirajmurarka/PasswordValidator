package com;
import com.InvalidPasswordException;
import com.PasswordValidation;

public class PasswordTestFeature2 {

	public static void main(String[] args) {
		
		int rank=5;
		//Case 1.1
		PasswordValidation pv = new PasswordValidation();
		String password = "Abcd";
		try {
			rank = pv.isValid(password,true);
		} catch (InvalidPasswordException e) {
			System.out.println(e.printMessage());
		}
		if (rank >= 3) {
			System.out.println("Password is OK for 2nd feature for input " + password );
		} else {
			System.out.println("Password is not OK for 2nd feature for input " + password);
		}
		
		//Case 1.2
		password = null;
		try {
			rank = pv.isValid(password,true);
		} catch (InvalidPasswordException e) {
			System.out.println(e.printMessage());
		}
		if (rank >= 3) {
			System.out.println("Password is OK for 2nd feature for input " + password );
		} else {
			System.out.println("Password is not OK for 2nd feature for input " + password);
		}

		//Case 1.3
		password = "abcde";
		try {
			rank = pv.isValid(password,true);
		} catch (InvalidPasswordException e) {
			System.out.println(e.printMessage());
		}
		if (rank >= 3) {
			System.out.println("Password is OK for 2nd feature for input " + password );
		} else {
			System.out.println("Password is not OK for 2nd feature for input " + password);
		}
		
		//Case 1.4
		password = "ABCDEFGHIJK";
		try {
			rank = pv.isValid(password,true);
		} catch (InvalidPasswordException e) {
			System.out.println(e.printMessage());
		}		
		if (rank >= 3) {
			System.out.println("Password is OK for 2nd feature for input " + password );
		} else {
			System.out.println("Password is not OK for 2nd feature for input " + password);
		}

		//Case 1.5
		password = "AbcdEFGSFGHHFS";
		try {
			rank = pv.isValid(password,true);
		} catch (InvalidPasswordException e) {
			System.out.println(e.printMessage());
		}
		if (rank >= 3) {
			System.out.println("Password is OK for 2nd feature for input " + password );
		} else {
			System.out.println("Password is not OK for 2nd feature for input " + password);
		}

		password = "Abcdefgh1";
		try {
			rank = pv.isValid(password,true);
		} catch (InvalidPasswordException e) {
			System.out.println(e.printMessage());
		}
		if (rank >= 3) {
			System.out.println("Password is OK for 2nd feature for input " + password );
		} else {
			System.out.println("Password is not OK for 2nd feature for input " + password);
		}


	}

}
