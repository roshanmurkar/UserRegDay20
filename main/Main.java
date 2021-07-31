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
		
		PasswordValidation passwordValidation=new PasswordValidation();
		passwordValidation.passwordValidate("Rosh@123");
		
		PasswordWithCondition passwordWithCondition=new PasswordWithCondition();
		passwordWithCondition.passwordValidation("Roshan07");
		
		PasswordWithConditionP2 passwordWithConditionP2=new PasswordWithConditionP2();
		passwordWithConditionP2.passwordValidation("R0shanaa");
	}
}