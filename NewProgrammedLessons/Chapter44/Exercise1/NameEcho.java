import java.util.Scanner;

public class NameEcho {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your name:");
		String name = scan.nextLine();

		name = name.trim();

		int i = name.indexOf(" ");

		String firstName = name.substring(0, i);
		String lastName = name.substring(i).toUpperCase();
		String output = firstName.concat(lastName);

		System.out.println(output);
	}
}