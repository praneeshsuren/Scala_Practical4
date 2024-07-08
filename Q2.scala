@main def main2(): Unit = {
  print("Enter a number: ");
  val input = scala.io.StdIn.readInt();

  input match {
      case x if x <= 0 => println("Negative/Zero is input")
      case x if x % 2 == 0 => println("Even number is given")
      case _ => println("Odd number is given")
    }
}