package main;

public class Main {
	public static void main(String[] args) {
	
		FirstNAmeValidation firstNAmeValidation=new FirstNAmeValidation();
		firstNAmeValidation.firstNameValidate("Roshan");
		
		LastNameValidation lastNameValidation=new LastNameValidation();
		lastNameValidation.lastNameValidate("Murkar");
		
		EmailValidation emailValidation=new EmailValidation();
		emailValidation.emailValidation("abc.xyz@bl.co.in");
		
		MobileNumValidation mobileNumValidation=new MobileNumValidation();
		mobileNumValidation.phoneNumberValidate("91 7276825217");
	}
}