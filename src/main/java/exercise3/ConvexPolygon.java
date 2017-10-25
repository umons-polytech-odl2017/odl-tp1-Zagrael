package exercise3;

import javax.swing.*;

public class ConvexPolygon {
	Point sommets[];

	// Constructeur
	public ConvexPolygon(int nbrPoints) {
		sommets = new Point[nbrPoints];
		for (int i = 0; i < nbrPoints; i++)
		{
			sommets = new Point();
		}
	}
}
