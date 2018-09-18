import java.util.Scanner;

public class WedgeOfStars{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int initial;

		System.out.println("Initial number of stars: ");
		initial = scan.nextInt();

		int i = 0;
		while (i < initial){
			int x = 0;
			while (x < (initial - i)){
				System.out.print("*");
				x = x + 1;
			}
			System.out.print("\n");
			i = i + 1;
		}
	}
}