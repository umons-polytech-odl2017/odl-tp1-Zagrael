package exercise3;

import java.util.Arrays;

public class Rectangle extends ConvexPolygon {
	private int m_largeur = 0;
	private int m_longueur = 0;

	// Constructeur
	public Rectangle() {}
	public Rectangle(Point A, Point B) {
		sommets = new Point[4];
		sommets[0] = A;
		sommets[1] = new Point(A.x(), B.y());
		sommets[2] = B;
		sommets[3] = new Point(B.x(), A.y());

		m_largeur = (Math.abs(B.x() - A.x()) <= Math.abs(B.y() - A.y())) ? Math.abs(B.x() - A.x()) : Math.abs(B.y() - A.y());
		m_longueur = (Math.abs(B.x() - A.x()) >= Math.abs(B.y() - A.y())) ? Math.abs(B.x() - A.x()) : Math.abs(B.y() - A.y());
	}

	// Méthodes
	@Override
	public double perimetre() {
		return 2 * (m_largeur + m_longueur);
	}

	@Override
	public double aire() {
		return m_largeur * m_longueur;
	}

	@Override
	public String toString() {
		return "Rectangle{" +
			"m_largeur=" + m_largeur +
			", m_longueur=" + m_longueur +
			", sommets=" + Arrays.toString(sommets) +
			'}';
	}
}
