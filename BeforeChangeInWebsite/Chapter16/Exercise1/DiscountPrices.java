import java.util.Scanner;
import java.text.*;

public class DiscountPrices{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		DecimalFormat numform = new DecimalFormat("0.00");
		int costInCents;
		int price;

		System.out.println("Enter amount of purchases in cents: ");
		costInCents = scan.nextInt();

		if (costInCents >= 1000){
			price = costInCents - (costInCents/10);
		} else {
			price = costInCents;
		}

		System.out.println("Price: $" + numform.format(price/10));

	}
}