import operations.AbstractOperation

class Calculator(private val operation: AbstractOperation) {
    fun calc(a: Int, b: Int) : Int {
        return operation.calc(a, b)
    }
}