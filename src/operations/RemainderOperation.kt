package operations

class RemainderOperation : AbstractOperation() {
    override fun calc(a: Long, b: Long): Long {
        return a % b
    }
}