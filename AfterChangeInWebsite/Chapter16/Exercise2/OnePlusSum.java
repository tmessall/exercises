import java.util.Scanner;

public class OnePlusSum {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int n;


		System.out.println("Enter n:");
		n = scan.nextInt();


		int i = 0;
		double sum = 0.0;
		while (i < n){
			i = i + 1;
			sum = sum + 1.0/i;
		}

		System.out.println("Sum is: " + sum);
	}
}