package exercise3;

public class Point {
	private int x = 0;
	private int y = 0;

	// Constructeur
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// Accesseurs
	public int x() { return x; }
	public int y() { return y; }

	public void setAbscisse(int x) { this.x = x; }
	public void setOrdonnee(int y) { this.y = y; }
}
