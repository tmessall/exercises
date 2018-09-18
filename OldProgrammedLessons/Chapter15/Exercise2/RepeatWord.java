import java.util.Scanner;

public class RepeatWord{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		String word;
		int timesRepeated;

		System.out.println("Enter a word:");
		word = scan.nextLine();
		timesRepeated = word.length();


		System.out.println(""); //break in output to make it look better


		int i = 0;
		while (i < timesRepeated){
			System.out.println(word);
			i = i + 1;
		}
	}
}