import java.io.*;

public class ReverserVersion2 {
	public static void main(String[] args) {
		int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		int[] result = {0,0,0,0,0,0,0,0,0,0,0,0,0,0};

		for (int j = 0; j < data.length; j++) {
			result[j] = data[data.length-1-j];
		}

		System.out.println("Result is ");
		for (int j = 0; j < result.length; j++) {
			System.out.print(result[j] + " ");
		}
		System.out.println("");
		for (int j = 0; j < data.length; j++) {
			System.out.print(data[j] + " ");
		}
	}
}