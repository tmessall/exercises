import java.util.Scanner;

public class TownDump{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int weightTrash;

		System.out.println("What is the weight of the load?");
		weightTrash = scan.nextInt();

		int price;

		if (weightTrash >= 200){
			price = 20;
			weightTrash = weightTrash-200;
		}

		while (weightTrash > 0){
			price = price + 8;
			weightTrash = weightTrash - 100;
		}

		System.out.println("Your charge is: %" + price);
	}
}