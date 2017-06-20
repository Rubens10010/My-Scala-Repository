val oneTwo = List(1,2)
val threeFour = List(3,4)
val oneTwoThreeFour = oneTwo:::threeFour
println("Thus, " + oneTwoThreeFour + " is a new list")
val oneTwoThree = 1::2::3::Nil
println(oneTwoThree)
val thrill = "Will"::"fill"::"until"::Nil
thrill(2)
thrill.count(s=>s.length == 4)
thrill.drop(2)		// returns thrill without 2 first elements
thrill.dropRight(2)	// return thrill list without its rightmost 2 elements
thrill.exists(s => s == "until")	// return true if exists until
thrill.filter(s => s.length == 4)	// elements in thrill that have 4
thrill.forall(s => s.endsWith("l"))	// indicaates whether all elements end with 'l'
thrill.foreach(s => print(s))	// executes print on each string in thrill list
thrill.foreach(print)
thrill.head
thrill.init	// list thrill without last element
thrill.isEmpty
thrill.last
thrill.length
thrill.map(s => s + "y")	// new list resulting from adding "y" to each string element in thrill
thrill.mkString(", ")	// makes a string with elements of the list
thrill.filterNot(s => s.length == 4)	// all except those with length 4
thrill.reverse
thrill.sort((s,t) => s.charAt(0).toLower < t.charAt(0).toLower)
thrill.tail	// list without first element 
