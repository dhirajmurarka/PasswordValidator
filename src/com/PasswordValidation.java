package com;

public class PasswordValidation {

	public static void isValid(String password, boolean appplyFeature2) throws InvalidPasswordException
	{
		int rank = 5;
		if (password == null)
		{
			if(appplyFeature2)
			{
				rank--;
			}
			else
			{
				throw new InvalidPasswordException(2);
			}
		}
		if (password.length() <= 8)
		{
			if(appplyFeature2)
			{
				rank--;
			}
			else
			{
				throw new InvalidPasswordException(1);
			}
		}

		int count = 0;
		for (int i = 65; i <= 90; i++) {
			if (password.contains(Character.toString((char) i))) {
				count = 1;
			}
		}
		if (count == 0) {
			if(appplyFeature2)
			{
				rank--;
			}
			else
			{
				throw new InvalidPasswordException(3);
			}
		}

		count = 0;
		for (int i = 90; i <= 122; i++) {
			if (password.contains(Character.toString((char) i))) {
				count = 1;
			}
		}
		if (count == 0) {
			if(appplyFeature2)
			{
				rank--;
			}
			else
			{
				throw new InvalidPasswordException(4);
			}
		}

		count = 0;
		for (int i = 0; i <= 9; i++) {
			if (password.contains(Integer.toString(i))) {
				count = 1;
			}
		}
		if (count == 0) {
			if(appplyFeature2)
			{
				rank--;
			}
			else
			{
				throw new InvalidPasswordException(5);
			}
		}
	}

	public static void main(String[] args) {
	}
}

