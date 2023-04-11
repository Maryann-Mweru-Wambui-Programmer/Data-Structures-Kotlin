import java.util.ArrayDeque
import java.util.Stack

fun main(){
    myStack()
}
fun myStack(){
    //addition of elements in a stack we use either addAll or push
    var names = Stack<Any>()
    names.addAll(listOf("Mweru", 1, "Monday", 11, 9.0, "School"))
    for (name in names){
        println(name)
    }
    names.push("Twenty")
    for (i in names){
        print(" $i")
    }
    //for removal of elements we use pop
    var popped = names.pop()
    println("\n$popped")
    //to get the first element on top of the list we use peek
     var topValue = names.peek()
    println(topValue)
    //to find a value we use search or contains and they return a Boolean true if found and false if otherwise
    println(names.contains(9.0))
    //to access the first element we use the first element method
    println("This is the first element of the list: ${names.firstElement()}")
    //to access the last element
    println("This is the last element: ${names.lastElement()}")
    //to add elements in the middle of the stack we use the add method
    names.add(3, "Coding")
    println("The new stack is $names")
    //for removing an element from the stack we use remove
    names.remove(11)
    println(names)
    //to remove an element at a specific index we use removeAt
    names.removeAt(2)
    println("The new stack after removal is: $names")
}
