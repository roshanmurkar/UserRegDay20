package main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumValidation {
		public void phoneNumberValidate(String str) {
			int flag = 0;
			Pattern pattern = Pattern.compile("^[+91][ 0-9]*{10,12}$");
			Matcher matcher = pattern.matcher(str);
			while (matcher.find()) {
				flag = 1;
			}
			if (flag == 1) {
				System.out.println("Valid phone number");
			} else {
				System.out.println("Invalid phone number");
			}

		}
}