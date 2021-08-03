class Person(val name: String){
  def upperCase(prompt: String): String = prompt + " " + name.toUpperCase()
}
val p = new Person("mert")


def hi(person: Person) = println(person.upperCase("hi"))

hi(new Person("mert"))

class PersonWithSurnameWithVals(var name: String, var surname: String, var age:Int)
class PersonWithSurnameWithVars(var name: String, var surname: String, var age:Int)
val person2 = new PersonWithSurnameWithVars("mert", "jojoe", 34)
println(person2.name)
println(person2.surname)
println(person2.age)

person2.name = "new name"
person2.surname = "new surname"
person2.age = person2.age * 2
println(person2.name)
println(person2.surname)
println(person2.age)


class Person2( name: String,  surname:String, age: Int)
def   Person2( name: String,  surname:String, age: Int) = ???

class Some1(val   x            :Int, var   y            :Int){
  def   z(x:Int)     :Int = ???
}


val   x            :Int = 1
var   y            :Int = 1
def   z(x:Int)     :Int = ???
class T(name:String)
trait K