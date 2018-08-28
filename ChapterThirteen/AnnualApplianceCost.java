import java.util.Scanner;

public class AnnualApplianceCost{
	public static void main(String[] args){

		double cost;
		int hours;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter cost per kilowatt-hour in cents:");
		cost = scan.nextDouble();
		System.out.println("Enter kilowatt-hours used per year:");
		hours = scan.nextInt();

		double annualCost = (cost/100)*hours;

		System.out.println("Annual cost: $" + annualCost);
	}
}