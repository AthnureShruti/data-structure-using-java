package basicChallenges;

import java.security.Identity;
import java.util.Scanner;

public class PasswordComplexity {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter Your Password : ");
		String password=scanner.next();
		if(checkPasswordComplexity(password)) {
			System.out.println("Strong password");
		}
		else {
			System.out.println("Weak Password");
		}

	}

	private static boolean checkPasswordComplexity(String password) {
		String level="Weak";
		if(password.length()<6) {
			return false;
		}
		boolean hasUpperCase=false;
		boolean hasLowerCase=false;
		boolean hasDigit=false;
		for(int i=0;i<password.length() || (!hasLowerCase && !hasUpperCase && !hasDigit);i++) {
			char current=password.charAt(i);
			if(Character.isUpperCase(current)) {
				hasUpperCase=true;
			}else if (Character.isLowerCase(current)) {
				hasLowerCase=true;
			}else if (Character.isDigit(current)) {
				hasDigit=true;
			}
		}
		return hasDigit && hasLowerCase && hasUpperCase ;
	}

}
