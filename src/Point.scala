// Scala
class Point(
  // adding `val` here automatically creates
  // public accessor methods named `x` and `y`
  val x: Double = 0.0, val y: Double = 0.0,
  addToGrid: Boolean = false) {

  // import functions/vars from companion object
  //if (addToGrid)  Point.grid.add(this)
  def distanceToPoint(other: Point) =
    Point.distanceBetweenPoints(x, y, other.x, other.y)
}

object Point {
  // private/protected members shared between
  // class and companion object
  //private val grid = new Grid()
  def distanceBetweenPoints(
    x1: Double, y1: Double,
    x2: Double, y2: Double) = {
    val xDist = x1 - x2
    val yDist = y1 - y2
    math.sqrt(xDist * xDist + yDist * yDist)
  }
}

class Ellips(middelpunt: Point, kort: Int, lang: Int)
class Cirkel(middelpunt: Point, straal: Int) extends Ellips(middelpunt, straal, straal) {
  def omtrek = 2 * straal * Cirkel.pi
  private val a = 0
}
object Cirkel {
  val b = Cirkel
  val pi = 3.14
}
