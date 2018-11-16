import java.io.*;

public class NearlyZero {
	public static void main(String[] args) {
		int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};
		int closest = 200000;

		for (int i = 0; i < data.length; i++) {
			if (Math.abs(data[i]) < closest) {
				closest = data[i];
			}
		}

		System.out.println("The nearest to zero is " + closest);
	}
}