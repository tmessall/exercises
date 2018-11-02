public class UnluckyEvilNumbers {
	public static void main(String[] args) {
		for (int i = 0; i < 1000; i++) {
			if (checkUnlucky(i)) {	
				if (! checkOdious(i)) {
					System.out.println(i + " is both unlucky and evil.");
				}
			}
		}
	}

	public static Boolean checkUnlucky(int x) {
		Boolean isThree = false;
		Boolean isUnlucky = false;

		while (x != 0) {
			if (! isThree) {
				if (x % 10 == 3) {
					isThree = true;
				}
			} else {
				if (x % 10 == 1) {
					isUnlucky = true;
				}
				if (x % 10 != 3) {
					isThree = false;
				}
			}
			x /= 10;
		}		

		return isUnlucky;
	}

	public static Boolean checkOdious(int x) {
		int oneCount = 0;
		int y = x;
		
		while (x != 0) {
			if (x % 2 == 1) {
				oneCount++;
			}
			x /= 2;
		}

		if (oneCount % 2 == 0) {
			return false;
		} else {
			return true;
		}
	}
}