package com.bl;

import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {
	static Scanner scan = new Scanner(System.in);

	public void phoneNoValidation() {
		System.out.print("Enter Phone Number :- "); // User Enters Phone Number
		String phoneNo = scan.nextLine();
		String phoneRegex = "^[0-9]{2}(\\s){1}[0-9]{10}$"; // Conditions for Email Address
		Pattern pattern = Pattern.compile(phoneRegex);
		Matcher matcher = pattern.matcher(phoneNo);
		System.out.println("First name pattern matching :- " + matcher.matches());
	}
}
