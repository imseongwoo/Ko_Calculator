package operations

class MultiplyOperation : AbstractOperation() {
    override fun calc(a: Int, b: Int): Int {
        return a * b
    }
}