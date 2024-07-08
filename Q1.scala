var itemNames = Array("Apple", "Banana", "Orange", "Grapes", "Mango")
var itemQuantity = Array(5,10,15,20,25)

def displayInventory(): Unit = {
  println("Item Name\tItem Quantity")
  for (i<-0 until itemNames.length) {
    println(itemNames(i) + "\t\t" + itemQuantity(i))
  }
}

def restockItem(name: String, quantity: Int): Unit = {
  if (itemNames.contains(name)) {
    var index = itemNames.indexOf(name)
    itemQuantity(index) += quantity
  } else {
    println("Item not found")
  }
}

def sellItem(name: String, quantity: Int): Unit = {
  if (itemNames.contains(name)) {
    var index = itemNames.indexOf(name)
    if (itemQuantity(index) >= quantity) {
      itemQuantity(index) -= quantity
    } else {
      println("Not enough quantity")
    }
  } else {
    println("Item not found")
  }
}

@main def main1(): Unit = {
    println("***********Welcome to the Inventory Management System*********")
    var continue = true
    while(continue){
        println("Enter 1 to display inventory")
        println("Enter 2 to restock item")
        println("Enter 3 to sell item")
        println("Enter 4 to exit")
        print("Enter your choice: ")
        var choice = scala.io.StdIn.readInt()
        println() 
        choice match {
            case 1 => displayInventory()
            case 2 => {
            print("Enter item name: ")
            var name = scala.io.StdIn.readLine()
            print("Enter quantity: ")
            var quantity = scala.io.StdIn.readInt()
            restockItem(name, quantity)
            }
            case 3 => {
            print("Enter item name: ")
            var name = scala.io.StdIn.readLine()
            print("Enter quantity: ")
            var quantity = scala.io.StdIn.readInt()
            sellItem(name, quantity)
            }
            case 4 => continue = false
            case _ => println("Invalid choice")
        }
        println()
    }
    println("Exiting...");
}