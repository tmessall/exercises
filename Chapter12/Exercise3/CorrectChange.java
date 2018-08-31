import java.util.Scanner;

public class CorrectChange{
	public static void main(String[] args) {

		int input;
		Scanner scan = new Scanner(System.in);

		System.out.println("Input the cents:");
		input = scan.nextInt();

		int dollars = input / 100;
		int changeLeft = input - dollars * 100;
		int quarters = changeLeft / 25;
		int noQuarters = changeLeft - quarters * 25;
		int dimes = noQuarters / 10;
		int noDimes = noQuarters - dimes * 10;
		int nickels = noDimes / 5;
		int cents = noDimes - nickels * 5;

		System.out.println("Your change is: " + dollars + " dollars, " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, and " + cents + " cents.");
	}
}