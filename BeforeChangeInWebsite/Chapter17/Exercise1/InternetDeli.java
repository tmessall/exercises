import java.util.Scanner;
import java.text.*;

public class InternetDeli{
	public static void main(String[] args){

		String item;
		Scanner scan = new Scanner(System.in);
		int costInCents;
		int delivery;
		DecimalFormat numform = new DecimalFormat("0.00");

		System.out.println("Enter the item: ");
		item = scan.nextLine();
		System.out.println("Enter the price in cents: ");
		costInCents = scan.nextInt();
		System.out.println("Overnight delivery (0==no, 1==yes): ");
		delivery = scan.nextInt();

		int itemRegularDelivery;
		int deliveryCharge;

		if (costInCents >= 1000){
			itemRegularDelivery = costInCents;
			deliveryCharge = 0;
		} else {
			itemRegularDelivery = costInCents + 200;
			deliveryCharge = 200;
		}

		int finalPrice;
		int finalDeliveryCharge;

		if (delivery == 1){
			finalPrice = itemRegularDelivery + 300;
			finalDeliveryCharge = deliveryCharge + 300;
		} else {
			finalPrice = itemRegularDelivery;
			finalDeliveryCharge = deliveryCharge;
		}

		System.out.println("Invoice: \n" + item + " " + numform.format(costInCents/100.0) + "\ndelivery " + numform.format(finalDeliveryCharge/100.0) + "\ntotal " + numform.format(finalPrice/100.0));
	}
}