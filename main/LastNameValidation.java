package main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastNameValidation {
		public void lastNameValidate(String str) {
			int flag = 0;
			Pattern pattern = Pattern.compile("^[A-Z][a-z]{3,10}");
			Matcher matcher = pattern.matcher(str);
			while (matcher.find()) {
				flag = 1;
			}
			if (flag == 1) {
				System.out.println("Valid last Name");
			} else {
				System.out.println("Invalid last Name");
			}

		}
}