import java.util.Scanner;

public class AddUpIntegers{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int howMany;

		System.out.println("How many integers will be added:");
		howMany = scan.nextInt();


		int i = 0;
		int sum = 0;
		while (i < 0){
			System.out.println("Enter an integer:");
			sum = sum + scan.nextInt();
			i = i + 1;
		}

		System.out.println("The sum is " + sum);
	} 
}