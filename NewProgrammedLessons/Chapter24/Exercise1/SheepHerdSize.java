public class SheepHerdSize{
	public static void main(String[] args){

		double power = 1.0;
		for(int t = 0; t < 26; t++){
			double n = 220/(1 + 10 * power);
			System.out.println("Sheep population after " + t + " years: " + n);
			power = power * 0.83;
		}
	}
}