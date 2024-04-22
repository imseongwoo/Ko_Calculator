class AbstractOperationImpl : AbstractOperation() {
    override fun add(a: Int, b: Int): Int {
        return a + b
    }

    override fun subtract(a: Int, b: Int): Int {
        return a - b
    }

    override fun multiple(a: Int, b: Int): Int {
        return a * b
    }

    override fun divide(a: Int, b: Int): Int {
        val divideResult = a.toDouble() / b
        return divideResult.toInt()
    }

    override fun remainder(a: Int, b: Int): Int {
        return a % b
    }
}