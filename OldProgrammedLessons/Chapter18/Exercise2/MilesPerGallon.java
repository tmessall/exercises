import java.util.Scanner;

public class MilesPerGallon{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int initialMiles;
		int finalMiles;
		int gallons;

		System.out.println("Inital miles: ");
		initialMiles = scan.nextInt();

		while (initialMiles >= 0){
			System.out.println("Final miles:");
			finalMiles = scan.nextInt();
			System.out.println("Gallons:");
			gallons = scan.nextInt();

			double milesPerGallon = (finalMiles - initialMiles + 0.0)/gallons;

			System.out.println("Miles per Gallon: " + milesPerGallon);
		}

		System.out.println("bye");
	}
}