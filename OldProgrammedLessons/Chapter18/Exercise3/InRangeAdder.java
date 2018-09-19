import java.util.Scanner;

public class InRangeAdder{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.println("Low end of range:");
		int lowEnd = scan.nextInt();
		System.out.println("High end of range:");
		int highEnd = scan.nextInt();


		System.out.println("Enter data: ");
		int number = scan.nextInt();

		int sumInRange = 0;
		int sumOutRange = 0;
		while (number != 0){
			if (number >= lowEnd && number <= highEnd){
				sumInRange = sumInRange + number;
			} else {
				sumOutRange = sumOutRange + number;
			}
			System.out.println("Enter data: ");
			number = scan.nextInt();
		}

		System.out.println("Sum of in range values: " + sumInRange);
		System.out.println("Sum of out of range values: " + sumOutRange);

	}
}