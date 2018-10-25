import java.util.Scanner;

public class ConeTester {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter radius:");
		double radius = scan.nextDouble();
		System.out.println("Enter height:");
		double height = scan.nextDouble();

		Cone cone = new Cone(radius, height);

		System.out.println("Area: " + cone.area() + " Volume: " + cone.volume());
	}
}