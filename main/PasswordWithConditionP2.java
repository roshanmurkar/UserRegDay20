package main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordWithConditionP2 {
	public void passwordValidation(String str) {
		int flag = 0;
		Pattern pattern = Pattern.compile("^([A-Z][0-9]{1}[a-zA-Z]{6,8}$)");
		Matcher matcher = pattern.matcher(str);
		while (matcher.find()) {
			flag = 1;
		}
		if (flag == 1) {
			System.out.println("valid password");
		} else {
			System.out.println("invalid password");
		}

	}
}