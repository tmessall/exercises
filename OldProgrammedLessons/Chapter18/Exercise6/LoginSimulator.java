import java.util.Scanner;

public class LoginSimulator{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);


		System.out.println("User Name:");
		String username = scan.nextLine();
		System.out.println("Password:");
		String password = scan.nextLine();


		while (! (username.equals("quit") && password.equals("exit"))){
			
			if (username.equals("joy") && password.equals("sun")){
				System.out.println("You have logged on with priority 4");
			} else if (username.equals("gates") && password.equals("money")){
				System.out.println("You have logged on with priority 1");
			} else if (username.equals("jobs") && password.equals("apple")){
				System.out.println("You have logged on with priority 3");
			} else if (username.equals("root") && password.equals("secret")){
				System.out.println("You have logged on with priority 5");
			} else {
				System.out.println("Logon failed.");
			}

			System.out.println("User Name:");
			username = scan.nextLine();
			System.out.println("Password:");
			password = scan.nextLine();
		}

		System.out.println("System shutting down. \nBye.");
	}
}