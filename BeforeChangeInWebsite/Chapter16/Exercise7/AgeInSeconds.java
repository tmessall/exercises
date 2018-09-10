import java.util.Scanner;

public class AgeInSeconds{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int years;
		int months;
		int days;

		System.out.println("How many years have you been alive?");
		years = scan.nextInt();
		System.out.println("How many months have you been alive in addition to that?");
		months = scan.nextInt();
		System.out.println("How many more days have you been alive in addition to that?");
		days = scan.nextInt();

		int daysFromYears = 365 * years;

		int[] daysInMonths = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
		int daysFromMonths = daysInMonths[months];

		int daysAlive = daysFromYears + daysFromMonths + days;
		int secondsAlive = daysAlive * 24 * 60 * 60;
		double percentage = (secondsAlive + 0.0)/(2.5 * Math.pow(10, 9)) * 100;

		System.out.println("Your age in seconds: " + secondsAlive + "\nPercentage of expected lifespan you have lived: " + percentage + "%");

	}
}