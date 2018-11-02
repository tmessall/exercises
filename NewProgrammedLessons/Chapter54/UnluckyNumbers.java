import java.util.Scanner;

public class UnluckyNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a positive integer (or a negative one to quit):");
		int x = scan.nextInt();

		while (x > 0) {
			if (checkUnlucky(x)) {
				System.out.println(x + " is unlucky.");
			} else {
				System.out.println(x + " is safe.");
			}
			System.out.println("Enter a positive integer (or a negative one to quit):");
			x = scan.nextInt();
		}

		System.out.println("Goodbye!");
	}

	public static Boolean checkUnlucky(int x) {
		Boolean isThree = false;
		Boolean isUnlucky = false;

		while (x != 0) {
			if (! isThree) {
				if (x % 10 == 3) {
					isThree = true;
				}
			} else {
				if (x % 10 == 1) {
					isUnlucky = true;
				}
				if (x % 10 != 3) {
					isThree = false;
				}
			}
			x /= 10;
		}		

		return isUnlucky;
	}

}