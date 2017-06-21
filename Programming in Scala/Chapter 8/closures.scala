/** Closures **/

/*< Function literals can also refer to variables defined elsewhere (free variables)
      in addition to its parameters (bounded variables) >*/
      
      var more = 1
      val addMore = (x: Int) => x + more  // closure (open term)
      addMore(10)
      
      // more variable is bind to addMore and changes inside or outside will become part of the variable
      
      // Each time this function is called it will create a new closure
      def makeIncreaser(more: Int) = (x: Int) => x + more
