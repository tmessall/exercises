import java.util.Scanner;

public class PieEatingContest{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int weight;

		System.out.println("Enter the conestant's weight in pounds: ");
		weight = scan.nextInt();

		String allowed;

		if (Math.abs(weight - 250) <= 30){
			allowed = "is allowed ";
		} else {
			allowed = "is not allowed ";
		}

		System.out.println("The contestant " + allowed + "in the contest.");

	}
}