import java.util.Scanner;
import java.text.*;

public class ChapterFourteenExTwo{
	public static void main(String[] args){

		double p;
		double r;
		double n;
		double t;
		Scanner scan = new Scanner(System.in);
		DecimalFormat numform = new DecimalFormat("0.00");

		System.out.println("Input the initial deposit: ");
		p = scan.nextDouble();
		System.out.println("Input the interest rate: ");
		r = scan.nextDouble();
		System.out.println("Input the number of times per year interest is calculated: ");
		n = scan.nextDouble();
		System.out.println("Input the number of years: ");
		t = scan.nextDouble();

		double vBase = 1 + r/n;
		double vPower = n*t;
		double v = p * Math.pow(vBase, vPower);

		System.out.println("Initial deposit: " + p + "\nInterest rate: " + r + "\nTimes per year: " + n + "\nNumber of years: " + t + "\nValue: $" + numform.format(v));

	}
}