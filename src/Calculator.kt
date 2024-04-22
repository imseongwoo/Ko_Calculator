class Calculator(private val operation: AbstractOperation) {
    fun addOperation(a: Int, b: Int): Int {
        return operation.add(a, b)
    }

    fun subtractOperation(a: Int, b: Int): Int {
        return operation.subtract(a, b)
    }

    fun divideOperation(a: Int, b: Int): Int {
        return operation.divide(a, b)
    }

    fun multipleOperation(a: Int, b: Int): Int {
        return operation.multiple(a, b)
    }

    fun remainderOperation(a: Int, b: Int): Int {
        return operation.remainder(a, b)
    }

}

fun main() {
    val abstractOperationImpl = AbstractOperationImpl()
    val calculator = Calculator(abstractOperationImpl)

    println("1 더하기 2 결과는 : ${calculator.addOperation(1, 2)} 입니다")
    println("1 빼기 2 결과는 : ${calculator.subtractOperation(1, 2)} 입니다")
    println("4 나누기 2 결과는 : ${calculator.divideOperation(4, 2)} 입니다")
    println("1 곱하기 2 결과는 : ${calculator.multipleOperation(1, 2)} 입니다")
    println("1과 2의 나머지연산 결과는 : ${calculator.remainderOperation(1, 2)} 입니다")
}