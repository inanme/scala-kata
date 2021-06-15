//Scala has no direct analog of the for (initialize; test; update)
for (x <- 1 to 3) print(s"$x ")
for (x <- 4 to 6)
  print(s"$x ")

var n = 5
var r = 1

while (n > 0) {
  r = r * n
  n -= 1
}
r