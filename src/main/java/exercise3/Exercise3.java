package exercise3;

public class Exercise3 {
	static ConvexPolygon buildConvexPolygon(Point[] vertices) {
		return new ConvexPolygon(vertices);
	}

	static ConvexPolygon buildRectangle(Point upperLeft, Point lowerRight) {
		return new Rectangle(upperLeft, lowerRight);
	}

	static ConvexPolygon buildSquare(Point upperLeft, int sideLength) {
		return new Square(upperLeft, sideLength);
	}

	static Ellipsis buildEllipsis(Point center, int xAxisLength, int yAxisLength) {
		return new Ellipsis(center, xAxisLength, yAxisLength);
	}

	static Ellipsis buildCircle(Point center, int radius) {
		return new Circle(center, radius);
	}

	static double computePerimeter(ConvexPolygon convexPolygon) {
		return convexPolygon.perimetre();
	}

	static double computeArea(ConvexPolygon convexPolygon) {
		return convexPolygon.aire();
	}

	static double computePerimeter(Ellipsis ellipsis) {
		return ellipsis.perimetre();
	}

	static double computeArea(Ellipsis ellipsis) {
		return ellipsis.aire();
	}
}
