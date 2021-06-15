//there is no static keyword in scala

//you can split `static` parts in a companion object

trait SomeClass

object SomeClass

object SomeOtherClass {
  def likeStatic = 1
}

class SomeOtherClass {
  def printIt() = println(SomeOtherClass.likeStatic)
}


new SomeOtherClass().printIt()

