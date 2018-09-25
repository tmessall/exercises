import java.util.Scanner;

public class BirthdayParadox{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);


		System.out.println("How many guests are there?");
		int guests = scan.nextInt();

		double probability = 1.0;
		for (int i = 0; i <= guests; i++){
			probability = probability * ( (365.0 - i) / 365);
		}

		System.out.println("The probability there are no shared birthdays is: " + probability * 100 + "%.");
	}
}