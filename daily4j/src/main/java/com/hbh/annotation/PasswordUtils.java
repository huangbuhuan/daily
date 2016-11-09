package com.hbh.annotation;

import java.util.List;

public class PasswordUtils {
	
	@UseCase(id = 47, description = "Password must contain at least one numeric")
	public boolean validatePassword(String password) {
		return (password.matches("\\w*\\d\\w*"));
	}
	
	@UseCase(id = 48)
	public String encrytPassword(String password) {
		return new StringBuilder(password).reverse().toString();
	}
	
	@UseCase(id = 49, description = "New passwords can't equal previously use ones")
	public boolean checkForNewPassword(List<String> prevpasswords, String password) {
		return !prevpasswords.contains(password);
	}
}
