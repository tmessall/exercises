public class TrimMethodString{

	public static void main( String[] args ){

		String first = new String(" 				ScottoElHotto is thicc		");
		String second = first.trim();

		System.out.println( first );
		System.out.println( second );
	}
}