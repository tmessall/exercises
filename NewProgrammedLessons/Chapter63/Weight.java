public class Weight {
	private int[] data;

	public Weight(int[] init) {
		data = new int[init.length];

		for (int i = 0; i < init.length; i++) {
			data[i] = init[i];
		}
	}

	public String toString() {
		String str = "Weights: ";
		for (int i = 0; i < data.length; i++) {
			str += data[i] + ", ";
		}

		return str;
	}
}