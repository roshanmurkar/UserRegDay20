package main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionalInterface
interface FirstName{
	void firstNameValidate(String fname);
}

@FunctionalInterface
interface LastName{
	void lastNameValidate(String lname);
}

@FunctionalInterface
interface Email{
	void EmailValidate(String email);
}

@FunctionalInterface
interface MobileNumber{
	void mobileNumValidate(String mobilenum);
}

@FunctionalInterface
interface Password{
	void passwordValidate(String pass);
}

public class UsingLambda {
	public static void main(String[] args) {
		//using lambda function - validation of first name
		FirstName fs = (fname)->{
			int flag = 0;
			Pattern pattern = Pattern.compile("^[A-Z][a-z]{3,10}$");
			Matcher matcher = pattern.matcher(fname);
			while (matcher.find()) {
				flag = 1;
			}
			if (flag == 1) {
				System.out.println(fname+ " -> First Name is valid");
			} else {
				System.out.println(fname+  " -> First Name is invalid");
			}
		};
		fs.firstNameValidate("Roshan");
		
		//using lambda function - validation of last name
		LastName ln = (lname)->{
			int flag = 0;
			Pattern pattern = Pattern.compile("^[A-Z][a-z]{3,10}");
			Matcher matcher = pattern.matcher(lname);
			while (matcher.find()) {
				flag = 1;
			}
			if (flag == 1) {
				System.out.println(lname+ " -> Last Name valid");
			} else {
				System.out.println(lname+ " -> Last Name invalid");
			}
		};
		ln.lastNameValidate("Murkar");
		
		//using lambda function -> Email validation
		Email e = (email)->{
			int flag = 0;
			Pattern pattern = Pattern.compile("^abc.[A-Za-z]+@bl.co");
			Matcher matcher = pattern.matcher(email);
			while (matcher.find()) {
				flag = 1;
			}
			if (flag == 1) {
				System.out.println(email+ " -> valid email address");
			} else {
				System.out.println(email+ "  -> invalid email address");
			}
		};
		e.EmailValidate("abc.ROShan@bl.co.in");
		
		// using lambda function -> Mobile number validation
		MobileNumber mn = (mobilenum)->{
			int flag = 0;
			Pattern pattern = Pattern.compile("^[91][ 0-9]{10,12}$");
			Matcher matcher = pattern.matcher(mobilenum);
			while (matcher.find()) {
				flag = 1;
			}
			if (flag == 1) {
				System.out.println(mobilenum+ " -> Valid mobile number");
			} else {
				System.out.println(mobilenum+ " -> Invalid mobile number");
			}
		};
		mn.mobileNumValidate("91 7276825217");
		
		// using lambda function -> password validation
		Password pw = (pass)->{
			int flag = 0;
			Pattern pattern = Pattern.compile("^[a-zA-Z0-9-_.@?]{8}$");
			Matcher matcher = pattern.matcher(pass);
			while (matcher.find()) {
				flag = 1;
			}
			if (flag == 1) {
				System.out.println(pass+ " -> valid password");
			} else {
				System.out.println(pass+ " -> invalid password");
			}
		};
		pw.passwordValidate("Roshan@7");
	}
	

}
