//define Shape, Circle, Rectangle, Square
//define area using subtype polymorphism
trait Shape { //interface
  def area(): Double = 0.0d
}

trait PrintableShape extends Shape {
  def printArea(): Unit = println(area())
}

class Circle(radius: Double) extends PrintableShape {
  override def area() = Math.PI * radius * radius
}

class Rectangle(width: Double, height: Double) extends PrintableShape {
  override def area(): Double = width * height
}
class Square(side: Double) extends PrintableShape {
  override def area(): Double = side * side
}

type PrintableShape1 = Shape with PrintableShape

def printArea(shape: PrintableShape): Unit = shape.printArea()

printArea(new Circle(10d))
printArea(new Square(10d))
printArea(new Rectangle(10d, 5d))