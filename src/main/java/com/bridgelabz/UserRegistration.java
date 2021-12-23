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
	
	/*
	 * method to check email address
	 */
	  public boolean emailAddress(String email) {
	        String regex = "^[a-z0-9]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+(.[a-z]{2,3}){0,1}$";
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(email);
	        return matcher.matches();
	    }
	  /*
	   * method to validate mobile number
	   *
	   */
	   public boolean phoneNumber(String phoneNumber) {
	        String regex = "^[0-9]{2}\\s{1}[0-9]{10}$";
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(phoneNumber);
	        return matcher.matches();
	    }
	   /*
		 * Method to check rule one minimum 8
		 *Characters - NOTE – All rules must
		 */
		public boolean passwordRule1(String password) {
			String regex = "^[0-9a-zA-Z]{8,}$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(password);
			return matcher.matches();
		}
		/*
		 * Method to check rule one minimum 8
		 *Should have at least 1
		 *Upper Case - NOTE – All rules must
		 */
		public boolean passwordRule2(String password) {
			String regex = "^[A-Z]{1}[a-z]{8,}$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(password);
			return matcher.matches();

		}
		/*
		 * Should have at least 1 numeric number in the password 
		 */
		public boolean passwordRule3(String password) {
			String regex = "^(?=.*[A-Z]){1}(?=.*[a-z])(?=.*[0-9]).{8,}$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(password);
			return matcher.matches();

		}

}
