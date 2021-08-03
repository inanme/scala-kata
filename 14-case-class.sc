import scala.beans.BeanProperty
//case class gives you: equals, hashcode, apply, unapply, toString, copy

case class SomeClass( x: Int)


def JavaLikeClass( x: Int) = ???

class JavaLikeClass(x: Int){
  def getMeMyX = x
  def print() = println(x)
}


class JavaLikeClass(val x: Int)

case class Money(val amount: Int, val currencyCode: String)

//object SomeClass {
//	def apply(value: Int) = SomeClass ={
//			new SomeClass(value)
//	}
//
//	def unapply(value: SomeClass) : Option[String] = {
//		Some(value.fieldName.toString)
//	}
//}

val y = SomeClass(1)
println(y.x)

// == equals
assert(SomeClass(1) == SomeClass(1))

//assert(new JavaLikeClass(1) == new JavaLikeClass(1))

println(new SomeClass(1).hashCode())
println(new SomeClass(1).hashCode())


println(new Money(2, "Dollar"))
assert(new Money(1, "Dollar") == new Money(1, "Dollar"))
