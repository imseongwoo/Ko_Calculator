package operations

class DivideOperation : AbstractOperation() {
    override fun calc(a: Long, b: Long): Long {
        val divideResult = a.toDouble() / b
        return divideResult.toLong()
    }
}