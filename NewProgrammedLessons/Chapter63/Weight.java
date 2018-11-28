public class Weight {
	private int[] data;

	public Weight(int[] init) {
		data = new int[init.length];

		for (int i = 0; i < init.length; i++) {
			data[i] = init[i];
		}
	}

	public String toString() {
		String str = "Weights: \n";
		for (int i = 0; i < data.length; i++) {
			str += data[i] + ", ";
		}

		return str;
	}

	public int average() {
		int avg = 0;
		for (int i = 0; i < data.length; i++) {
			avg += data[i];
		}

		avg = (avg/data.length);

		return avg;
	}
}