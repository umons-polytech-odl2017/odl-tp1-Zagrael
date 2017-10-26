package exercise3;

import java.util.Arrays;

public class ConvexPolygon {
	protected Point[] sommets;

	// Constructeurs
	public ConvexPolygon() {

	}
	public ConvexPolygon(Point p[]) {
		sommets = new Point[p.length];
		for (int i = 0; i < p.length; i++)
			sommets[i] = new Point(p[i]);
	}

	// Méthodes
	public double perimetre() {
		double v = 0.0;
		for (int i = 0; i < sommets.length - 1; i++)
		{
			v += Math.sqrt((sommets[i].x() - sommets[i + 1].x()) * (sommets[i].x() - sommets[i + 1].x()) + (sommets[i].y() - sommets[i + 1].y()) * (sommets[i].y() - sommets[i + 1].y()));
		}
		v += Math.sqrt((sommets[sommets.length - 1].x() - sommets[0].x()) * (sommets[sommets.length - 1].x() - sommets[0].x()) + (sommets[sommets.length - 1].y() - sommets[0].y()) * (sommets[sommets.length - 1].y() - sommets[0].y()));
		return v;
	}

	public double aire() {
		double v = 150;
		/* ? Subdiviser le polygone en triangles ? */
		return v;
	}

	// Méthodes réécrites
	@Override
	public String toString() {
		return "ConvexPolygon{" +
			"sommets=" + Arrays.toString(sommets) +
			'}';
	}
}
