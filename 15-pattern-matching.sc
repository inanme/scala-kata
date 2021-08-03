//define Shape, Circle, Rectangle, Square using case class
//define printArea using pattern matching
trait Shape
case class Circle(radius: Double) extends Shape
case class Rectangle(width: Double, height: Double) extends Shape
case class Square(side: Double) extends Shape
case object Point extends Shape //return 0

def printArea(shape: Shape): Double =
  shape match {
    case Circle(radius) if radius > 0 => Math.PI * radius * radius
    case Rectangle(width, height)     => width * height
    case Square(side)                 => side * side
    case Point                        => 0d
    case _                            =>
      println(shape)
      0d
  }

printArea(Circle(2d))
printArea(Circle(-2d))
printArea(Rectangle(2d, 4d))
printArea(Square(5d))
printArea(Point)
