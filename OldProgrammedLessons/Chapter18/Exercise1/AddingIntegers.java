import java.util.Scanner;

public class AddingIntegers{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int checker;
		int sum = 0;


		System.out.println("Enter first integer (enter 0 to quit): ");
		checker = scan.nextInt();
		if (checker == 0){
			System.out.println("No integers were entered. \nbye");
		} else {
			while (checker > 0 || checker < 0){
				sum = checker + sum;
				System.out.println("Enter an integer (or 0 to quit): ");
				checker = scan.nextInt();
			}
			System.out.println("Sum of the integers: " + sum + "\nbye");
		}

	}
}