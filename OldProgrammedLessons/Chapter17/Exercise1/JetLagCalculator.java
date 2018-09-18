import java.util.Scanner;

public class JetLagCalculator{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int hoursTraveled;
		int timeZonesCrossed;
		int departureTime;
		int arrivalTime;


		System.out.println("How many hours was your flight?");
		hoursTraveled = scan.nextInt();
		System.out.println("How many time zones did you cross?");
		timeZonesCrossed = scan.nextInt();
		System.out.println("What time did you depart? (enter in military time, i.e. noon is 1200)");
		departureTime = scan.nextInt();
		System.out.println("What time did you arrive? (enter in military time, i.e. noon is 1200)");
		arrivalTime = scan.nextInt();


		int departValue;
		if (departureTime >= 800 && departureTime < 1200){
			departValue = 0;
		} else if (departureTime >= 1200 && departureTime < 1800){
			departValue = 1;
		} else if (departureTime >= 1800 && departureTime < 2200){
			departValue = 3;
		} else if (departureTime >= 2200 || departureTime < 100){
			departValue = 4;
		} else {
			departValue = 5;
		}

		int arriveValue;
		if (arrivalTime >= 800 && arrivalTime < 1200){
			arriveValue = 4;
		} else if (arrivalTime >= 1200 && arrivalTime < 1800){
			arriveValue = 2;
		} else if (arrivalTime >= 1800 && arrivalTime < 2200){
			arriveValue = 0;
		} else if (arrivalTime >= 2200 || arrivalTime < 100){
			arriveValue = 1;
		} else {
			arriveValue = 3;
		}


		double daysRecovery = (hoursTraveled/2.0 + (timeZonesCrossed - 3) + departValue + arriveValue)/10;

		System.out.println("Days of recovery: " + daysRecovery);
	}
}