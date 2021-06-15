
def increment1(x: Int): Int = x + 1
val increment2: Int => Int = x => x + 1
val increment3: Int => Int = _ + 1 //_ placeholder
var increment4: Int => Int = _ + 2
increment4 = p => p + 3

def multiply(x: Int, y: Int) = x * y                                    // 4


increment1(1)
increment2(2)
increment3(3)
increment4(4)

val x: Int = 1
def add(x: Int, y: Int): Int = x + y

add(1, 2)

val add2: Int => (Int => Int) =
  x => y => x + y

add2(1)
add2(1)(2)

def even(x: Int): String = if (x % 2 == 0) "even" else "odd"
assert(even(2) == "even")
assert(even(1) == "odd")

def aFormatter(x: Any, prefix: String = "[", suffix: String = "]") =
  prefix + x + suffix

assert(aFormatter(1) == "[1]")
assert(aFormatter(2, "(", ")") == "(2)")
assert(aFormatter(3, prefix = "(", suffix = ")") == "(3)")
assert(aFormatter(4, suffix = ")", prefix = "(") == "(4)")

//Function composition
val F : Int => Int = x  => x + 1
val G : Int => Int = x  => x * 2
val FoG = F compose G
val GoF = F andThen G
FoG(2)
GoF(2)
