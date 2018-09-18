import java.util.Scanner;

public class FurtherSubstringFun{
	public static void main(String[] args){

		String input;
		int beginIndex;
		int endIndex;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the phrase/sentence you want: ");
		input = scan.nextLine();
		System.out.println("Enter beginning index: ");
		beginIndex = scan.nextInt();
		System.out.println("Enter ending index: ");
		endIndex = scan.nextInt();

		System.out.println("Original string: " + input + "\nSubstring: " + input.substring(beginIndex,endIndex) );
	}
}