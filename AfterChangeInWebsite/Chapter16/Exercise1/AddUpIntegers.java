import java.util.Scanner;

public class AddUpIntegers{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int howMany;

		System.out.println("How many integers will be added:");
		howMany = scan.nextInt();


		int i = 1;
		int sum = 0;
		
		while ( i <= howMany ) {
			System.out.println("Enter an integer:");
			int x = scan.nextInt();
			i = i + 1;
			sum = sum + x;
		}

		System.out.println("The sum is " + sum);

	} 
}