import java.util.Scanner;

public class StartEndValue{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int start;
		int end;


		System.out.println("Enter start value:");
		start = scan.nextInt();
		System.out.println("Enter end value:");
		end = scan.nextInt();

		System.out.println(""); //break in output so it looks nicer

		while (start <= end){
			System.out.println(start);
			start = start + 1;
		}
	}
}