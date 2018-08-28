import java.util.Scanner;
import java.text.*;

public class ChapterFourteenExThree{
	public static void main(String[] args){

		double rate;
		Scanner scan = new Scanner(System.in);
		DecimalFormat numform = new DecimalFormat("0.0");

		System.out.println("Input the interest rate: ");
		rate = scan.nextDouble();

		double years = 72/(rate*100);

		System.out.println("Number of years: " + numform.format(years));

	}
}