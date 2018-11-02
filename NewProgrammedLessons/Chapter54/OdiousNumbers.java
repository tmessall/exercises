import java.util.Scanner;

public class OdiousNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a positive integer (or a negative one to quit):");
		int x = scan.nextInt();

		while (x > 0) {
			if (checkOdius(x)) {
				System.out.println(x + " is odious.");
			} else {
				System.out.println(x + " is evil (not odious).");
			}
			System.out.println("Enter a positive integer (or a negative one to quit):");
			x = scan.nextInt();
		}

		System.out.println("Goodbye!");
	}

	public static Boolean checkOdius(int x) {
		int oneCount = 0;
		int y = x;
		
		while (x != 0) {
			if (x % 2 == 1) {
				oneCount++;
			}
			x /= 2;
		}

		if (oneCount % 2 == 0) {
			return false;
		} else {
			return true;
		}
	}
}