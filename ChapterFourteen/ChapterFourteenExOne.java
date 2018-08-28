import java.text.*;

public class ChapterFourteenExOne{
	public static void main(String[] args){

		DecimalFormat numform = new DecimalFormat("0.000000");
		DecimalFormat zeroform = new DecimalFormat("0.0");
		double angle = -105.0;
		
		while (angle <= 75.0){
			
			angle = angle + 15;
			double radValue = angle * Math.PI/180;
			
			if (angle < 0){
				System.out.println(angle + "\t" + numform.format(Math.sin(radValue)));			
			} else if (angle == 0){
				System.out.println("  " + angle + "\t" + " " + zeroform.format(Math.sin(radValue)));
			} else {
				System.out.println(" " + angle + "\t" + " " + numform.format(Math.sin(radValue)));
			}
		}
	}
}