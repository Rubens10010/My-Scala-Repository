var x = List("Cool", "tools", "rule")	// lists
println(x)
val y = Array("Zero", "one", "two")	// array inmutable
println(y)
val pair = (99, "Luftballons")	// tuple2[Int, String]
println(pair)
println(pair._1)

// mutable and inmmutable sets
var jetSet = Set("Boeing","Airbus")	// inmmutable
jetSet += "Lear"
println(jetSet.contains("Cessna"))

import scala.collection.mutable

val movieSet = mutable.Set("Hitch","Poltergeist")    // mutable
movieSet += "Shrek"
println(movieSet)

// explocot set class : hashSet

import scala.collection.immutable.HashSet

val hashSet = HashSet("Tomatoes","Chilies")
println(hashSet + "Coriander")

// mutable map

// import scala.collection.mutable

val treasureMap = mutable.Map[Int, String]()
treasureMap += (1 -> "Go to island.")
treasureMap += (2 -> "Find big X on ground")
treasureMap += (3 -> "Dig.")
println(treasureMap(2))

// immutable map

val romanNumeral = Map(
	1 -> "I", 2 -> "II", 3 -> "III", 4 -> "IV", 5 -> "V"
)
println(romanNumeral(4))

