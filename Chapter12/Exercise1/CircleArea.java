import java.util.Scanner;

public class CircleArea{

	public static void main( String[] args ) {

		System.out.println("Input the radius: ");

		Scanner scan = new Scanner( System.in );
		int input;
		input = scan.nextInt();
		double area = input * input * Math.PI;

		System.out.println("The area is: " + area);
	}
}