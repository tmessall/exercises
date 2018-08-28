public class ReassigningvaluestoVariables
{
	public static void main ( String[] args )
	{
		double x = 0.0;
		double value = 3 * x * x - 8 * x + 4;
		System.out.println("At X = " + x + " the value is " + value );
		double x = 2.0;
		double value = 3 * x * x - 8 * x + 4;
		System.out.println("At X = " + x + " the value is " + value );
		double x = 4.0;
		double value = 3 * x * x - 8 * x + 4;
		System.out.println("At X = " + x + " the value is " + value );
	}
}