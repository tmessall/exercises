import java.io.*;

public class SmoothOperator{
	public static void main(String[] args) {
		int[] signal = {1, 5, 4, 5, 7, 6, 8, 6, 5, 4, 5, 4};
		int[] smooth = new int[signal.length];

		smooth[0] = (signal[0] + signal[1]) / 2;
		smooth[signal.length - 1] = (signal[signal.length - 1] + signal[signal.length - 2]) / 2;
		for (int i = 1; i < signal.length - 1; i++) {
			smooth[i] = (signal[i] + signal[i - 1] + signal[i + 1]) / 3;
		}

		System.out.println("");
		
		System.out.print("Signal: ");
		for (int i = 0; i < signal.length; i++) {
			System.out.print(signal[i] + " ");
		}

		System.out.println("");

		System.out.print("Smooth: ");
		for (int i = 0; i < smooth.length; i++) {
			System.out.print(smooth[i] + " ");
		}
	}
}