import java.util.Scanner;

public class PasswordChecker {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your password:");
		String password = scan.nextLine();

		Boolean acceptable = false;
		
		while (! acceptable) {
			Boolean longEnough = false;
			Boolean lowerCase = false;
			Boolean upperCase = false;
			Boolean digit = false;
			
			if (password.length() >= 7) {
				longEnough = true;
			}	
			
			for (int i = 0; i < password.length(); i++) {
				String alphabet = "abcdefghijklmnopqrstuvwxyz";
				for (int j = 0; j < alphabet.length(); j++) { 
					if (password.charAt(i) == alphabet.charAt(j)) {
						lowerCase = true;
					}
					if (password.charAt(i) == alphabet.toUpperCase().charAt(j)) {
						upperCase = true;
					}
				}
				
				String digits = "1234567890";
				for (int j = 0; j < digits.length(); j++) {
					if (password.charAt(i) == digits.charAt(j)) {
						digit = true;
					}
				}

			}

			if (longEnough && lowerCase && upperCase && digit) {
				acceptable = true;
			} else {
				System.out.println("That password is not acceptable.\n");
				System.out.println("Enter your password:");
				password = scan.nextLine();
			}
		}

		System.out.println("Acceptable password.");


	}
}