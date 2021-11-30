package com.bl;

import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {
	static Scanner scan = new Scanner(System.in);

	public void firstNameValidation() {
		System.out.print("Enter first Name :- "); // User Enters First Name
		String firstName = scan.nextLine();
		String nameRegex = "^[A-Z][A-Z a-z]{3,}$"; // Conditions of Entering First name
		Pattern pattern = Pattern.compile(nameRegex);
		Matcher matcher = pattern.matcher(firstName);
		System.out.println("First name pattern matching :- " + matcher.matches());
	}
}
