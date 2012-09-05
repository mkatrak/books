package sk.mka.books.patterns.bridge;

/** "Refined Abstraction" */
class CircleShape extends Shape {
	private double x, y, radius;

	public CircleShape(double x, double y, double radius, DrawingAPI drawingAPI) {
		super(drawingAPI);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	// low-level i.e. Implementation specific
	public void draw() {
		drawingAPI.drawCircle(x, y, radius);
	}

	// high-level i.e. Abstraction specific
	public void resizeByPercentage(double pct) {
		radius *= pct;
	}
}