//define Shape, Circle, Rectangle, Square
//define area using subtype polymorphism
trait Shape { //interface
  def area(): Double
}

class Circle(radius: Double) extends Shape {
  override def area() = Math.PI * radius * radius
}

class Rectangle(width: Double, height: Double) extends Shape {
  override def area(): Double = width * height
}
class Square(side: Double) extends Shape {
  override def area(): Double = side * side
}

def printArea(shape: Shape): Unit = println(shape.area())

printArea(new Circle(10d))
printArea(new Square(10d))
printArea(new Rectangle(10d, 5d))