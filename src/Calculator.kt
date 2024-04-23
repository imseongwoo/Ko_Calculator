import operations.AbstractOperation

class Calculator(private val operation: AbstractOperation) {
    fun calc(a: Long, b: Long) : Long {
        return operation.calc(a, b)
    }
}