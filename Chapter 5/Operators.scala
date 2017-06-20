val sum = 1 + 2 // Scala invokes 1.+(2)
// indexof searches string for the first occurrence of a character
val s = "Hello world"
s indexOf 'o'
s indexOf('o',5)

// prefix operators
(2.0).unary_-

// postfix operators takes no arguments
s.toLowerCase

// division
11/4 // 2
11.0f / 4.0f // 2.75
11.0 % 2.0 // 3.0

true && false // short-circuit
true & false  // don't short-circuit'

List(1,2,3) == List(1,2,3)
List(1,2,3) == "Hello"
List(1,2,3) == null

// rich operators
0 max 5
0 min 5
-2.7 abs
-2.7 round
1.5 isInfinity
(1.0/0) isInfinity
4 to 6
"bob" capitalize
"robert" drop 2
