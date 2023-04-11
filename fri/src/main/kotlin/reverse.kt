import java.util.Stack

fun main(){
    myString()
}
fun myString(){
    var sentence = Stack<String>()
    sentence.addAll(listOf("My", "Name", "Is", "Maryann", "Mweru"))
    sentence.reverse()
    println(sentence)
}