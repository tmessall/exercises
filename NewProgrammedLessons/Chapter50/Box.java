public class Box {
	double width;
	double height;
	double length;


	public Box(double width, double height, double length) {
		this.width = width;
		this.height = height;
		this.length = length;
	}	

	public Box(Box oldbox) {
		this.height = oldbox.height();
		this.width = oldbox.width();
		this.length = oldbox.length();
	}

	
	public Box biggerBox() {
		return new Box(1.25*this.width(), 1.25*this.height(), 1.25*this.length());
	}


	public double length() {
		return this.length;
	}

	public double width() {
		return this.width;
	}

	public double height() {
		return this.height;
	}


	public double volume() {
		double volume = width * length * height;
		return volume;
	}

	public double area() {
		double area = 2 * (faceArea() + topArea() + sideArea());
		return area;
	}

	public boolean nests(Box outsideBox) {
		if (heightFits(outsideBox) && widthFits(outsideBox) && lengthFits(outsideBox)) {
			return true;
		} else {
			return false;
		}
	}

	private double faceArea() {
		double faceArea = width * height;
		return faceArea;
	}

	private	double topArea() {
		double topArea = width * length;
		return topArea;
	}

	private double sideArea() {
		double sideArea = length * height;
		return sideArea;
	}

	private boolean heightFits(Box outsideBox) {
		if (this.height < outsideBox.height()) {
			return true;
		} else {
			return false;
		}
	}

	private boolean widthFits(Box outsideBox) {
		if (this.width < outsideBox.width()) {
			return true;
		} else {
			return false;
		}
	}

	private boolean lengthFits(Box outsideBox) {
		if (this.length < outsideBox.length()) {
			return true;
		} else {
			return false;
		}
	}

}
