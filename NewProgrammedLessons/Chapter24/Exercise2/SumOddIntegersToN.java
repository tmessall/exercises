import java.util.Scanner;

public class SumOddIntegersToN{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.println("Input integer N:");
		int n = scan.nextInt();

		int sum = 0;
		int square = n * n;
		for (int i = 1; i < n; i = i + 2){
			sum = sum + i;
		}

		System.out.println("Sum of all odd integers 1 to N: " + sum + "\nN^2: " + square);
	}
}