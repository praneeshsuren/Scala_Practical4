def toUpper(s: String): String = {
    return s.toUpperCase()
}

def toLower(s: String): String = {
    return s.toLowerCase()
}

def formatNames(name: String)(formatFunc: String => String): String = {
    formatFunc(name)
}

def formatNames(x: String, y: Int): String = {
  y match {
    case 1 => toUpper(x) 
    case 2 => toUpper(x.substring(0, 2)) + x.substring(2) 
    case 3 => toLower(x) 
    case 4 => toUpper(x.head.toString) + x.substring(1, x.length - 1) + toUpper(x.last.toString) 
    case _ => x 
  }
}

@main def main(): Unit = {
    // Test inputs
    val names = List("Benny", "Niroshan", "Saman", "Kumara")

    // Test outputs
    println(formatNames(names(0), 1));
    println(formatNames(names(1), 2));
    println(formatNames(names(2), 3));
    println(formatNames(names(3), 4));
}