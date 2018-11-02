import java.util.Scanner;

public class PerfectNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("What do you want the upper limit to be?");
		int x = scan.nextInt();

		for (int i = 0; i < x; i++) {
			if (checkPerfect(i)) {
				System.out.println(i + " is a perfect number.");
			}
		}

	}

	public static Boolean checkPerfect(int x) {
		int sumDivisors = 0;
		for (int i = 1; i < x; i++) {
			if (x % i == 0) {
				sumDivisors += i;
			}
		}
		if (sumDivisors == x) {
			return true;
		} else {
			return false;
		}
	}
}