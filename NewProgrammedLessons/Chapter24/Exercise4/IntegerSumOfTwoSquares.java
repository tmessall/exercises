import java.util.Scanner;

public class IntegerSumOfTwoSquares{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);


		System.out.println("What is N?");
		int n = scan.nextInt();



		Boolean yesSum = false;
		for (int a = 0; a * a <= n; a++){
			for (int b = 0; b <= a; b++){
				if (n == (a * a) + (b * b)){
					System.out.println("N is a sum of two squares: " + a + "^2 + " + b + "^2.");
					yesSum = true;
				}
			}
		}

		if (! yesSum){
			System.out.println("N is not a sum of two squares.");
		}
	}
}