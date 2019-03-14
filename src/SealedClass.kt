sealed class MyOperation {
    class Add(val value: Int) : MyOperation()
    class Substract(val value: Int) : MyOperation()
    class Multiply(val value: Int) : MyOperation()
    class Divide(val value: Int) : MyOperation()
}


fun main(args : Array <String>) {
//Sealed Class
    var op:MyOperation =MyOperation.Multiply(9)
    fun execute(x: Int, op: MyOperation) = when (op) {
        is MyOperation.Add -> x + op.value
        is MyOperation.Substract -> x - op.value
        is MyOperation.Multiply -> x * op.value
        is MyOperation.Divide -> x / op.value
    }
    println(execute(5,op))
}
