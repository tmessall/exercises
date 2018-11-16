import java.io.*;

public class ThreeSums {
	public static void main(String[] args) {
		int[] data = {3, 2, 5, 7, 9, 12, 97, 24, 52};
		int sum = 0;
		int oddSum = 0;
		int evenSum = 0;

		for (int i = 0; i < data.length; i++) {
			sum += data[i];
			if (data[i] % 2 == 0) {
				evenSum += data[i];
			} else {
				oddSum += data[i];
			}
		}

		System.out.println("Total sum: " + sum);
		System.out.println("Even sum: " + evenSum);
		System.out.println("Odd sum: " + oddSum);
	}
}