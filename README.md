                                    <SCALA>
                                    
*** compatible with scala and scalac version 2.12.2 ***

Book:
 -- Programming in Scala ... 2016 by Martin Odersky, Lex Spoon and Bill Venners

How to compile:

Interpreter:
  scala
---------------------------------------------------------------
Script:
  scala fileName*.scala
---------------------------------------------------------------
Application
................................................
without daemon but slow:
  scalac mainFile.scala sourceFiles*.scala
  scala mainFile.scala
................................................
Fast with daemon:
  fsc mainFile.scala sourceFiles*.scala
  scala mainFile.scala
  fsc -shutdown
---------------------------------------------------------------
