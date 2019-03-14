data class DataClass(var str:String, var i:Int)

fun main(args : Array <String>) {
//DataClass
    var dataClass = DataClass("utku", 7)
    println("Data class $dataClass:  Data class ilk eleman: ${dataClass.str} ikinci eleman:  ${dataClass.i}")
}