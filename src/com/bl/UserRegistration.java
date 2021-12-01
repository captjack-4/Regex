package com.bl;

import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {
	static Scanner scan = new Scanner(System.in);

	public void passwordValidation() {
		System.out.print("Enter Password :- "); // User Enters Password
		String password = scan.nextLine();
		String passRegex = "^[A-Z{1,}0-9{1,}a-z]{8}$"; // Rules for Password - At least one Upper Case and Numeric
														// Character
		Pattern pattern = Pattern.compile(passRegex);
		Matcher matcher = pattern.matcher(password);
		System.out.println("First name pattern matching :- " + matcher.matches());
	}
}
