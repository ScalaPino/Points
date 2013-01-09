object Main {
  def quickSort[A <% Ordered[A]](xs: List[A]): List[A] = xs match {
    case Nil => xs // lege lijst, geef lege lijst terug
    case pivot :: lijst_zonder_kop => // ontbonden lijst met de fragmenten kop en staart
      lijst_zonder_kop partition (_ < pivot) // splits de lijst in twee lijsten
      match { case (onder, boven) => quickSort(onder) ++ (pivot :: quickSort(boven)) }
  }
  def main(args: Array[String]): Unit = {}

  def printValue(x: String) = println("I ate a %s".format(x))

  var x: Int = 0
  val hexDigit = if (x > 10) x + 'A' else x + '0'

  def isPrime(prime: Int) = true
  val n = 0
  val i = 0
  for {
    i <- 1 until n
    j <- 1 until i
    if isPrime(i + j)
  } yield (i, j)

  (1 until n) flatMap (i =>
    (1 until n).withFilter(j => isPrime(i + j))
      .map(j => (j, i)))

}