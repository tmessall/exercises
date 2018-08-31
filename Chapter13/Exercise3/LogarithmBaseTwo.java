import java.util.Scanner;

public class LogarithmBaseTwo{
	public static void main(String[] args){

		double input;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a double:");
		input = scan.nextDouble();

		double logBaseTwo = Math.log(input)/Math.log(2);

		System.out.println("Base 2 log of " + input + " is " + logBaseTwo);
	}
}