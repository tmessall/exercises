import java.util.Scanner;

public class OneLineWords{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		String firstWord;
		String secondWord;


		System.out.println("Enter first word:");
		firstWord = scan.nextLine();
		System.out.println("Enter second word:");
		secondWord = scan.nextLine();
		int firstLength = firstWord.length();
		int secondLength = secondWord.length();

		System.out.println(""); //break to make output look better

		System.out.print(firstWord);
		int i = 0;
		while (i < (30 - firstLength - secondLength)){
			System.out.print(".");
			i = i + 1;
		}
		System.out.print(secondWord);

	}
}