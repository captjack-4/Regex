package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bl.UserRegistration;

public class TestClass {
	@Test
	public void testFirstNameRight() {
		UserRegistration user = new UserRegistration();
		boolean output = user.firstNameValidation("Akshay");
		assertEquals(true, output);
	}

	@Test
	public void testFirstNameWrong() {
		UserRegistration user = new UserRegistration();
		boolean output = user.firstNameValidation("akshay");
		assertEquals(false, output);
	}

	@Test
	public void testLastNameRight() {
		UserRegistration user = new UserRegistration();
		boolean output = user.lastNameValidation("Shinde");
		assertEquals(true, output);
	}

	@Test
	public void testLastNameWrong() {
		UserRegistration user = new UserRegistration();
		boolean output = user.lastNameValidation("shinde");
		assertEquals(false, output);
	}

	@Test
	public void testEmailIDRight() {
		UserRegistration user = new UserRegistration();
		boolean output = user.emailIDValidation("abc.xyz@bl.co.in");
		assertEquals(true, output);
	}

	@Test
	public void testEmailIDWrong() {
		UserRegistration user = new UserRegistration();
		boolean output = user.emailIDValidation("abc");
		assertEquals(false, output);
	}

	@Test
	public void testPhoneNoRight() {
		UserRegistration user = new UserRegistration();
		boolean output = user.phoneNoValidation("9876543210");
		assertEquals(true, output);
	}

	@Test
	public void testPhoneNoWrong() {
		UserRegistration user = new UserRegistration();
		boolean output = user.phoneNoValidation("91 9876543210");
		assertEquals(false, output);
	}

	@Test
	public void testPasswordRight() {
		UserRegistration user = new UserRegistration();
		boolean output = user.passwordValidation("Abcde@123");
		assertEquals(true, output);
	}

	@Test
	public void testPasswordWrong() {
		UserRegistration user = new UserRegistration();
		boolean output = user.passwordValidation("Abc@123");
		assertEquals(false, output);
	}
}
