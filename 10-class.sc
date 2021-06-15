class Person(val name: String){
  def upperCase(prompt: String): String = prompt + " " + name.toUpperCase()
}

def hi(person: Person) = println(person.upperCase("hi"))

hi(new Person("mert"))

class Person2( name: String,  surname:String, age: Int)
def   Person2( name: String,  surname:String, age: Int) = ???
