import java.util.Scanner;

public class StandardDeviation{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int n;

		System.out.println("How many numbers are to follow?");
		n = scan.nextInt();


		int i = 0;
		double sum = 0.0;
		double sumSquares = 0.0;
		while (i < n){
			double x;
			System.out.println("Enter a floating point number:");
			x = scan.nextDouble();
			sum = sum + x;
			sumSquares = sumSquares + (x * x);
			i = i + 1;
		}


		double avg = sum / n;
		double avgSquared = avg * avg;
		double avgOfSquares = sumSquares / n;
		double standardDeviation = Math.sqrt(avgOfSquares - avgSquared);

		System.out.println(""); //break to make output look nice
		System.out.println("Average: " + avg + "\nAverage squared: " + avgSquared + "\nAverage of Squares: " + avgOfSquares + "\nStandard Deviance: " + standardDeviation);
	}
}