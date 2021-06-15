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