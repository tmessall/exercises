import java.util.Scanner;

public class MatineeMovieTickets{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int age;
		int time;
		double price;

		System.out.println("How old is the customer?");
		age = scan.nextInt();
		System.out.println("What time is it?");
		time = scan.nextInt();

		if (time < 1700){
			if (age < 14){
				price = 2.00;
			} else {
				price = 5.00;
			}
		} else {
			if (age < 14){
				price = 4.00;
			} else {
				price = 8.00;
			}
		}

		System.out.println("The price of your ticket is: $" + price);

	}
}