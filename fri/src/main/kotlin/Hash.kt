import java.util.LinkedHashMap

fun `main`(){
    hash()
}
fun hash(){
    val names = hashMapOf("Paul" to 28, "Sam" to 21, "Joy" to 10, "Mike" to 26, "Tom" to 5)
    var emptyArray: Array<Any> = arrayOf()
    var myArray = emptyArray.toMutableList()
    val arraySize = 5
    var letter = 'a'
    val test = letter.toInt()

    fun conversion() {
        var requiredIndex = 0
        while (names != null) {
            for (name in names.keys) {
                var ascii = name[0].toLowerCase().toInt()
                var index = ascii - test
                requiredIndex = index % arraySize
                println("$name" + "$requiredIndex")
                if (myArray.size < arraySize) {
                    myArray.add(requiredIndex, name)
                }
            }
            println(myArray)
        }
    }
    conversion()


    //println(requiredIndex)
//    var ascii = name[0].toLowerCase().toInt()
//    var index = ascii - test
//    requiredIndex = index % arraySize
//    println("$name" + "$requiredIndex")
//    if (myArray.size < arraySize){
//        myArray.add(requiredIndex, name)

}
