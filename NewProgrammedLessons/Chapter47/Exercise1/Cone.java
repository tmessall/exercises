public class Cone {
	double height;
	double radius;


	public Cone(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}


	public void setHeight(double height) {
		this.height = height;
	}

	public void  setRadius(double radius) {
		this.radius = radius;
	}

	public double getHeight() {
		return this.height;
	}

	public double getRadius() {
		return this.radius;
	}

	public double area() {
		double area = Math.PI * radius * slantHeight() + Math.PI * radius * radius;
		return area;
	}

	public double volume() {
		double volume = (Math.PI * radius * radius * height) / 3;
		return volume;
	}

	public double slantHeight() {
		double slantHeight = Math.sqrt(radius * radius + height * height);
		return slantHeight;
	}

	public double angle() {
		double angle = Math.atan(radius / height);
		return angle;
	}
}