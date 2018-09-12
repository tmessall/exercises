import java.util.Scanner;

public class PowerOfANumber{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		double x;
		int n;


		System.out.println("Enter X:");
		x = scan.nextDouble();
		System.out.println("Enter N:");
		n = scan.nextInt();

		if (n < 0){

			System.out.println("N must be a positive integer.");

		} else {

			int i = 0;
			double value = 1.0;
			while (i < n){

				value = value * x;
				i = i + 1;

			}

			System.out.println(x + " raised to the power " + n + " is: " + value);
		}
	}
}