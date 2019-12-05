object MainObject{  
  def main(args:Array[String]){  
    
    print("Sula - add in stack")
    val stack = new Stack[Int]
    stack.push(1)
    stack.push(2)
    println(stack.pop)  // prints 2
    println(stack.pop)  // prints 1

    print("Sula - open source project")
    functionExample()
  }  
  
  def functionExample(){
    println("This is a simple function")  
  }  
} 