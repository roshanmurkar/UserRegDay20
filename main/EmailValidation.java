package main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
		public void emailValidation(String str) {
			int flag = 0;
			Pattern pattern = Pattern.compile("^abc.[A-Za-z]+@bl.co");
			Matcher matcher = pattern.matcher(str);
			while (matcher.find()) {
				flag = 1;
			}
			if (flag == 1) {
				System.out.println("valid email");
			} else {
				System.out.println("invalid email");
			}

		}
}