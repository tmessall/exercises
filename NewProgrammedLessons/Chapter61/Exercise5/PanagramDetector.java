import java.util.Scanner;

public class PanagramDetector {
	public static void main(String[] args) {
		int[] appearances = new int[26];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String potentialPanagram = scan.nextLine();

		String alphabet = "abcdefghijklmnopqrstuvwxyz";

		for (int i = 0; i < potentialPanagram.length(); i++) {
			for (int j = 0; j < alphabet.length(); j++) {
				if (potentialPanagram.toLowerCase().charAt(i) == alphabet.charAt(j)) {
					appearances[j]++;
				}
			}
		}

		System.out.println("");

		Boolean panagram = true;
		for (int i = 0; i < appearances.length; i++) {
			if (appearances[i] == 0) {
				panagram = false;
			}
		}

		if (panagram) {
			System.out.println("That is a panagram.");
		} else {
			System.out.println("That is not a panagram.");
		}
	}
}