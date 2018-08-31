import java.util.Scanner;

public class OhmsLaw{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int input1;
		int input2;

		System.out.println("What is the voltage?");
		input1 = scan.nextInt();
		System.out.println("What is the resistance?");
		input2 = scan.nextInt();

		int voltage = input1;
		int resistance = input2;

		double current = (voltage + 0.0)/resistance;

		System.out.println("The voltage is " + voltage + " and the resistance is " + resistance + " so the current is " + current);
	}
}