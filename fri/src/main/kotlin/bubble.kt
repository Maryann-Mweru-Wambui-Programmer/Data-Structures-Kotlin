import java.util.Arrays

fun main(){
    """The entry point of the function.
        This is where the calling of the function occurs.
    """.trimMargin()
    bubbleSort(elements = arrayOf(20, 1, 23, 34, 6, 8, 10))

}
fun bubbleSort(elements: Array<Int>){
    """Use of bubble sort algorithms to sort an array of integers.
        The declaration of a function.
    """.trimMargin()
    var arraySize = elements.size
    for (i in 1..(arraySize - 1)){
        for (j in 0.rangeTo(arraySize - 1 - i)){
            if (elements[j] > elements[j + 1]){
                var temp = elements[j]
                elements[j] = elements[j + 1]
                elements[j + 1] = temp
            }
        }

    }
    println(Arrays.toString(/* a = */ elements))




}