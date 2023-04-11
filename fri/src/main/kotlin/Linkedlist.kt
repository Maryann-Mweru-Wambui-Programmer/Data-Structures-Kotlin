import java.util.LinkedList

fun main(){
    """The entry point of the program. 
        myList function will be called here
    """.trimMargin()
    myList()
}
fun myList(){
    """A function to create a linked list.
        Declaration of myList function.
    """.trimMargin()
    //Addition of elements in the linked list
    var schools = LinkedList<String>()
    schools.addAll(arrayOf("Riara", "Pangani", "Brookside", "Moi"))
    println(schools)
    //Getting the first element
    println("The first element: ${schools.first}")
    //The last element
    println("The last element is: ${schools.last}")
    //addition of an element to the start of a list
    schools.addFirst("Moringa")
    println("The new list is: $schools")
    //removal of the last element
    schools.removeLast()
    println("Elements after removal of the last: ")
    for (school in schools){
        print(" $school")
    }
    print("\n")
    //addition of an element at a specific position
    schools.add(2, "JKUAT")
    println("The schools are: $schools")
    //checking whether a certain element is in a list
    println(schools.contains("Moi"))
    //reversing element
    schools.reverse()
    println("The elements after reversal: $schools")
}