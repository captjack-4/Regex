package com.bl;

import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {
	static Scanner scan = new Scanner(System.in);

	public void passwordValidation() {
		System.out.print("Enter Password :- "); // User Enters Password
		String password = scan.nextLine();
		String passRegex = "^[A-Za-z0-9]{8,}"; // Conditions for Email Address
		Pattern pattern = Pattern.compile(passRegex);
		Matcher matcher = pattern.matcher(password);
		System.out.println("First name pattern matching :- " + matcher.matches());
	}
}
