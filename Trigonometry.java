public class Trigonometry
{
	public static void main( String[] args )
	{
		double sinValue = Math.sin( 0.5236 );
		double cosValue = Math.cos( 0.5236 );
		double sumSquares = (sinValue * sinValue) + (cosValue * cosValue);
		System.out.println("Sine is: " + sinValue + "\nCosine is: " + cosValue + "\nSum squares is: " + sumSquares);
	}
}