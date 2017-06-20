val a = 'A'
val A = '\u0041'
val backslash = '\\'
val endline = '\n'
val tab = '\t'
val form = '\f'
val ret = '\r'  // return to beginning of line
val doublequote = '\"'
val singlequote = '\''

// Raw string
println(""" Welcome to Ultamix 3000.
            Type "HELP" for help.""")
            
// Deal with blank spaces
println("""|Welcome to Ultamix 3000.
           |Type "HELP" for help.""".stripMargin)
           
// Symbol literals
// Symbols are written as 'ident. where ident can be any alphanumeric identifier

def updateRecordByName(r: Symbol, value: Any) = {
  // code goes here 
}

updateRecordByName('favoriteAlbum, "OK Computer")
val s = 'aSymbol
val nm = s.name // gets the string of a symbol

// String interpolation
// You can place any expression after a dollar sign($) in a processed string literal starting with 's'
val name = "reader"
println(s"Hello, $name!")   // alternative to concatenation, result is "hello,reader!"

  // string interpolation for raw expressions
  println(raw"NO\\\\escape!")
  
  // string interpolation with c printf style
  println(f"${math.Pi}%.5ff")
