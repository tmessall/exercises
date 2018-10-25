public class Cylinder {
	double radius;
	double height;


	public Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getRadius() {
		return this.radius;
	}

	public double getHeight() {
		return this.height;
	}


	public double area() {
		double area = 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
		return area;
	}

	public double volume() {
		double volume = Math.PI * radius * radius * height;
		return volume;
	}
}