//collections are immutable by default
val array = Array(1, 2, 3)
val array2 = array ++ Array(4, 5)
val array3 = array :+ 6
val array4 = 7 +: array

val list = List(1, 2, 3)
val list2 = list ++ List(4, 5)
val list3 = list :+ 6
val list4 = 7 +: list

val set = Set(1, 1, 1, 2, 3)
val set2 = set ++ Set(1, 2, 3)
val set3 = set2 + 4

val map = Map("key1" -> 1, "key2" -> 2)
val map2 = map ++ Map("key3" -> 3)
val map3 = map2 + ("key4" -> 4)

val list1: List[Int] = List(1, 2, 3)
val list1: List[Any] = List(1, 2, 3, "mert")
val list1 = (1, 0d, 3, "mert", 34, 3, 43, 43, 43, 34, 34, 34, 34, 3, 43, 43, 343, 43)

array.map(x => x + 1)
list.map(x => x + 1)
set.map(x => x + 1)

array.filter(x => x > 1)
list.filter(x => x > 1)
set.filter(x => x > 1)

list.sum
list.product
list.fold(0)((total, current) => total + current)
list.fold(1)((total, current) => total * current)