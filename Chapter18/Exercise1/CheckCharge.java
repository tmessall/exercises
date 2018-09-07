import java.util.Scanner;

public class CheckCharge{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int checking;
		int savings;

		System.out.println("What is the balance of the checking account?");
		checking = scan.nextInt();
		System.out.println("what is the balance of the savings account?");
		savings = scan.nextInt();

		double serviceCharge;

		if (checking >= 1000 || savings >=1500){
			serviceCharge = 0.00;
		} else {
			serviceCharge = 0.15;
		}

		System.out.println("The service charge is: %" + serviceCharge);

	}
}