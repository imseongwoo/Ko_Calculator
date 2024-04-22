package operations

class DivideOperation : AbstractOperation() {
    override fun calc(a: Int, b: Int): Int {
        val divideResult = a.toDouble() / b
        return divideResult.toInt()
    }
}