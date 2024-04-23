package operations

class MultiplyOperation : AbstractOperation() {
    override fun calc(a: Long, b: Long): Long {
        return a * b
    }
}