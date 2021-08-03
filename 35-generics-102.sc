class Foo[+A] // A covariant class
class Bar[-A] // A contravariant class
class Baz[A]  // An invariant class


//Covariance
abstract class Animal {
  def name: String
}
case class Cat(name: String) extends Animal
case class Dog(name: String) extends Animal


def printAnimalNames(animals: List[Animal]): Unit =
  animals.foreach {
    animal => println(animal.name)
  }

val cats: List[Cat] = List(Cat("Whiskers"), Cat("Tom"))
val dogs: List[Dog] = List(Dog("Fido"), Dog("Rex"))

// prints: Whiskers, Tom
printAnimalNames(cats)

// prints: Fido, Rex
printAnimalNames(dogs)


class X[-A]
class Y[+A]
class Z[A]

//contravariant
val x: X[String] = new X[Object] //Specialize -, should not be exposed
//covariant
val y: Y[Object] = new Y[String] //Generalize +, can be exposed
//invariant
val z: Z[String] = new Z[String]


