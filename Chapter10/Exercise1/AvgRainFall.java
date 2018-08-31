public class AvgRainFall
{
	public static void main( String[] args )
	{
		int apr_rain = 12;
		int may_rain = 14;
		int jun_rain = 8;
		int total = apr_rain + may_rain + jun_rain;
		double average = total/3.0;
		System.out.println("Rainfall for April: \t" + apr_rain);
		System.out.println("Rainfall for May: \t" + may_rain);
		System.out.println("Rainvall for June: \t" + jun_rain);
		System.out.println("Average rainfall: \t" + average);
	}
}