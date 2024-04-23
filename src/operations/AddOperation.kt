package operations

class AddOperation : AbstractOperation() {
    override fun calc(a: Long, b: Long): Long {
        return a + b
    }
}