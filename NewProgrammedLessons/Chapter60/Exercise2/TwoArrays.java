public class TwoArrays {
	public static void main(String[] args) {
		int[] val = {13, -4, 82, 17};

		System.out.println( "Original Array: " + val[0] + " " + val[1] + " " + val[2] + " "
			+ val[3]);

		int[] twice = {val[0] * 2, val[1] * 2, val[2] * 2, val[3] * 2};

		System.out.println( "New Array: " + twice[0] + " " + twice[1] + " " + twice[2] + " "
			+ twice[3]);
	}
}