import java.util.Scanner;

public class Permutations{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		long n;
		long r;


		System.out.println("Enter n (a non-negative):");
		n = scan.nextLong();
		System.out.println("Enter r (a non-negative that is less than or equal to n):");
		r = scan.nextLong();


		if (n < 0 || r < 0 || r > n){

			System.out.println("Error with n or r: make sure both are 0 or positive and r is not greater than n.");

		} else {

			int i = 1;
			long permutations = 1;
			while (i < (n + 1)){
				permutations = i * permutations;
				i = i + 1;
			}
			int x = 1;
			while ( x < (n - r + 1)){
				permutations = permutations / x;
				x = x + 1;
			}
			System.out.println("Number of permutations: " + permutations);

		}
	}
}