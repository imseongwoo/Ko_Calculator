package operations

class SubtractOperation : AbstractOperation() {
    override fun calc(a: Long, b: Long): Long {
        return a - b
    }
}