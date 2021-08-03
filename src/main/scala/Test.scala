object Test {

  trait Shape
  case class Circle(radius: Double) extends Shape
  case class Rectangle(width: Double, height: Double) extends Shape
  case class Square(side: Double) extends Shape
  //class Point //return 0

  def printArea(shape: Shape): Double =
    shape match {
      case Circle(radius)           => Math.PI * radius * radius
      case Rectangle(width, height) => width * height
      //case Square(side)             => side * side
    }

  printArea(Circle(2d))
  printArea(Rectangle(2d, 4d))
  printArea(Square(5d))


}
