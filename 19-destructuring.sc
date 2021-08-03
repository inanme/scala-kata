//destructing
case class Circle(radius: Double)

//unapply
val Circle(x) = Circle(1)

print(x)
val m2 = (1, 2)
val m3 = (1, 2, 3)
val m4 = (1, 2, 3, 4)

def doubleValues(x: Int, y: Int): (Int, Int) = (x + 1, y + 1)

val (m, n) = doubleValues(1, 2)
println(m)
println(n)

doubleValues(3, 4) match {
  case (k, t)  =>
    println(k)
    println(t)
}