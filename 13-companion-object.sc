//there is no static keyword in scala

//you can split `static` parts in a companion object

trait SomeClass

//companion object
object SomeClass // object is a JVM wide singleton

object SomeOtherClass {
  def likeStatic = 1
}

class SomeOtherClass {
  def printIt() = println(SomeOtherClass.likeStatic)
}


new SomeOtherClass().printIt()

