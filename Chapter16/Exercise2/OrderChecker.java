import java.util.Scanner;

public class OrderChecker{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int bolts;
		int nuts;
		int washers;

		System.out.println("Number of bolts: ");
		bolts = scan.nextInt();
		System.out.println("Number of nuts: ");
		nuts = scan.nextInt();
		System.out.println("Number of washers: ");
		washers = scan.nextInt();

		if (nuts < bolts){
			System.out.println("Check the Order: too few nuts.");
		}
		if (washers < 2 * bolts){
			System.out.println("Check the Order: too few washers.");
		}

		int cost = 5 * bolts + 3 * nuts + washers;

		System.out.println("Total cost: " + cost);

	}
}