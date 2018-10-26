public class BoxTester{
	public static void main(String[] args) {
		Box box = new Box(2.5,5.0,6.0);
		Box box2 = new Box(box);

		System.out.println("Area: " + box.area() + " Volume: " + box.volume());
		System.out.println("Length: " + box.length() + " Height: " + box.height() + " Width: " + box.width());

		System.out.println("Area: " + box2.area() + " Volume: " + box2.volume());

		Box bigBox = box2.biggerBox();

		System.out.println("Length: " + bigBox.length() + " Height: " + bigBox.height() + " Width: " + box.width());

		System.out.println("The box fits is: " + box2.nests(bigBox));
		System.out.println("The box fits is: " + bigBox.nests(box2));
	}
}