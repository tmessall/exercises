public class Trigonometry
{
	public static void main( String[] args )
	{
		int degreeValue = 30;
		double radValue = degreeValue * Math.PI/180;
		double sinValue = Math.sin( radValue );
		double cosValue = Math.cos( radValue );
		double sumSquares = (sinValue * sinValue) + (cosValue * cosValue);
		System.out.println("Sine is: " + sinValue + "\nCosine is: " + cosValue + "\nSum squares is: " + sumSquares);
	}
}