package com.bl;

import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {

	public boolean firstNameValidation(String firstName) {

		String nameRegex = "^[A-Z][A-Z a-z]{3,}$"; // Conditions of Entering First name
		Pattern pattern = Pattern.compile(nameRegex);
		Matcher matcher = pattern.matcher(firstName);
		System.out.println("First name pattern matching :- " + matcher.matches());
		return true;
	}

	public boolean lastNameValidation(String lastName) {

		String nameRegex = "^[A-Z][A-Z a-z]{3,}$"; // Conditions of Entering Last name
		Pattern pattern = Pattern.compile(nameRegex);
		Matcher matcher = pattern.matcher(lastName);
		System.out.println("Last name pattern matching :- " + matcher.matches());
		return true;
	}

	public boolean emailIDValidation(String emailID) {

		String emailRegex = "^[a-z0-9-._]{1,}+[@][a-z0-9 .]{1,}$"; // Conditions for Email Address
		Pattern pattern = Pattern.compile(emailRegex);
		Matcher matcher = pattern.matcher(emailID);
		System.out.println("Email Id pattern matching :- " + matcher.matches());
		return true;
	}

	public boolean phoneNoValidation(CharSequence phoneNo) {

		String phoneRegex = "^[0-9]{2}(\\s){1}[0-9]{10}$"; // Conditions for Email Address
		Pattern pattern = Pattern.compile(phoneRegex);
		Matcher matcher = pattern.matcher(phoneNo);
		System.out.println("Phone Number pattern matching :- " + matcher.matches());
		return true;
	}

	public boolean passwordValidation(String password) {

		String passRegex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$&_-]){1}([A-Za-z0-9]).{8,}"; // Rules for Password - Atleast one Upper Case,Numeric Character and Special Character																						 																																								
		Pattern pattern = Pattern.compile(passRegex);
		Matcher matcher = pattern.matcher(password);
		System.out.println("Password pattern matching :- " + matcher.matches());
		return true;
	}
}
