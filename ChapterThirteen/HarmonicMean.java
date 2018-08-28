import java.util.Scanner;

public class HarmonicMean{
	public static void main(String[] args){

		double numberX;
		double numberY;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter X:");
		numberX = scan.nextDouble();
		System.out.println("Enter Y:");
		numberY = scan.nextDouble();

		double arithmeticMean = (numberX + numberY)/2;
		double harmonicMean = 2 / (1/numberX + 1/numberY);

		System.out.println("Arithmetic mean: " + arithmeticMean + "\nHarmonic mean: " + harmonicMean);

	}
}