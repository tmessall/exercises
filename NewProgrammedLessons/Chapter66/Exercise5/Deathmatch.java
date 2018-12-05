class Firefly {
	private double xLocation;
	private double yLocation;
	private double zLocation;
	private Boolean alive;

	public Firefly(double xLocation, double yLocation, double zLocation, Boolean alive) {
		this.xLocation = xLocation;
		this.yLocation = yLocation;
		this.zLocation = zLocation;
		this.alive = alive;
	}


	public void kill() {
		this.alive = false;
	}

	public void move() {
		xLocation += (double)(Math.random()*2 - 1.0);
		yLocation += (double)(Math.random()*2 - 1.0);
		zLocation += (double)(Math.random()*2 - 1.0);
		if (xLocation > 10.0) {
			xLocation = 10.0;
		} else if (xLocation < -10.0) {
			xLocation = -10.0;
		}
		if (yLocation > 10.0) {
			yLocation = 10.0;
		} else if (yLocation < -10.0) {
			yLocation = -10.0;
		}
		if (zLocation > 10.0) {
			zLocation = 10.0;
		} else if (zLocation < -10.0) {
			zLocation = -10.0;
		}
	}

	public double getXLocation() {
		return xLocation;
	}
	public double getYLocation() {
		return yLocation;
	}
	public double getZLocation() {
		return zLocation;
	}
	public Boolean getAlive() {
		return this.alive;
	}
}


class Warriors {
	private Firefly[] dm;

	public Warriors() {
		dm = new Firefly[10];

		for (int i = 0; i < dm.length; i++) {
			dm[i] = new Firefly((double)(Math.random()*20 - 10.0), (double)(Math.random()*20 - 10.0), (double)(Math.random()*20 - 10.0), true);
		}
	}

	public int getLength() {
		return 10;
	}

	public Firefly getEntry(int x) {
		return dm[x];
	}




}

public class Deathmatch {
	public static void main(String[] args) {
		Warriors round = new Warriors();
		System.out.println("Running the deathmatch...");
		int killCount = 0;
		int winner = -1;
		while (killCount != 9) {
			for (int i = 0; i < round.getLength(); i++) {
				if (round.getEntry(i).getAlive()) {
					round.getEntry(i).move();
					for (int j = 0; j < round.getLength(); j++) {
						if (j != i && round.getEntry(j).getAlive()) {
							if (killDistance(round.getEntry(i), round.getEntry(j))) {
								round.getEntry(j).kill();
								System.out.println("Firefly " + i + " killed Firefly " + j + "!");
								killCount++;
								winner = i;
							}
						}
					}
				}

			}
		}

		System.out.println("Firefly " + winner + " won!");	
	}

	public static Boolean killDistance(Firefly a, Firefly b) {
		double xDistance = b.getXLocation() - a.getXLocation();
		double yDistance = b.getYLocation() - a.getYLocation();
		double zDistance = b.getZLocation() - a.getZLocation();
		xDistance = xDistance * xDistance;
		yDistance = yDistance * yDistance;
		zDistance = zDistance * zDistance;
		double toBeRooted = xDistance + yDistance + zDistance;
		double totalDistance = Math.sqrt(toBeRooted);
		if (totalDistance <= 1.0) {
			return true;
		} else {
			return false;
		}
	}
}