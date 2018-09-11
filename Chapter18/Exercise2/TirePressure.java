import java.util.Scanner;

public class TirePressure{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int rightFront;
		int leftFront;
		int rightBack;
		int leftBack;
		String inflation;

		System.out.println("Input right front pressure: ");
		rightFront = scan.nextInt();
		System.out.println("Input left front pressure: ");
		leftFront = scan.nextInt();
		System.out.println("Input right back pressure: ");
		rightBack = scan.nextInt();
		System.out.println("Input left back pressure: ");
		leftBack = scan.nextInt();

		if (rightFront == leftFront && rightBack == leftBack){
			inflation = "OK";
		} else {
			inflation = "not OK";
		}

		System.out.println("Inflation is " + inflation);
		
	}
}