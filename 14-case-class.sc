case class SomeClass(x: Int)
class JavaLikeClass(x: Int)

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

assert(SomeClass(1) == SomeClass(1))

assert(new JavaLikeClass(1) == new JavaLikeClass(1))

//case class gives you: equals, hashcode, apply, unapply, toString
