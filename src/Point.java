// Java:
public class Point {
  private double x, y;
 
  public Point(final double X, final double Y) {
    x = X;
    y = Y;
  }
 
  public double x() {
    return x;
  }
 
  public double y() {
    return y;
  }
 
  public Point(final double X,
    final double Y,
        final boolean ADD2GRID) {
    this(X, Y);
 
    if (ADD2GRID)
			grid.add(this);
  }
 
  public Point() {
    this(0.0, 0.0);
  }
 
  double distanceToPoint(final Point OTHER) {
    return distanceBetweenPoints(x, y,
      OTHER.x, OTHER.y);
  }
 
  private static Grid grid = new Grid();
 
  static double distanceBetweenPoints(
      final double X1, final double Y1,
      final double X2, final double Y2
  ) {
    double xDist = X1 - X2;
    double yDist = Y1 - Y2;
    return Math.sqrt(xDist*xDist + yDist*yDist);
  }}