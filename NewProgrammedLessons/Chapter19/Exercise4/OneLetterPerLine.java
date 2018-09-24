import java.util.Scanner;

public class OneLetterPerLine{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);


		System.out.println("Enter a word:");
		String word = scan.nextLine();


		int i = 0;
		while (i < word.length()){
			System.out.println(word.charAt(i));
			i++;
		}
	}
}