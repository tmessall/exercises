import java.util.Scanner;

public class CentsToDollars{

	public static void main( String[] args ) {

		Scanner scan = new Scanner( System.in );
		int input;

		System.out.println("Input the cents:");
		input = scan.nextInt();

		int dollars = input / 100;
		int centsRemaining = input % 100;

		System.out.println("That is " + dollars + " dollars and " + centsRemaining + " cents.");

	}
}