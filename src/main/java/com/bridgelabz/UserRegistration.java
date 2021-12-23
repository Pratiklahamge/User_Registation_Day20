package com.bridgelabz;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	/*
	 * method to check first name
	 */
	
	public boolean firstName(String firstName) {
		
		String regex="^[A-z]{1}[a-z]*";
		Pattern pattern=Pattern.compile(regex);
		Matcher match=pattern.matcher(firstName);
		
		return match.matches();
		
	}
	
	/*
	 * method to chek last name 
	 */
	
	public boolean lastName(String lastName) {
		String regex = "^[A-Z]{1}[a-z]{4}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(lastName);
		return matcher.matches();
	}

}
