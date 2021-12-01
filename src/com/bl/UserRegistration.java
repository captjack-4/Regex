package com.bl;

import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {
	static Scanner scan = new Scanner(System.in);

	public void emailIDValidation() {
		System.out.print("Enter Email Address :- "); // User Enters Email Address
		String emailID = scan.nextLine();
		String emailRegex = "^[a-z0-9-._]{1,}+[@][a-z0-9 .]{1,}$"; // Conditions for Email Address
		Pattern pattern = Pattern.compile(emailRegex);
		Matcher matcher = pattern.matcher(emailID);
		System.out.println("First name pattern matching :- " + matcher.matches());
	}
}
