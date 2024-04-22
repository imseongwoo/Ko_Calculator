class Calculator(private val operation: AbstractOperation) {
    fun calc(a: Int, b: Int) : Int {
        return operation.calc(a, b)
    }
}

fun main() {
    val add = AddOperation()
    val subtract = SubtractOperation()
    val multiply = MultiplyOperation()
    val divide = DivideOperation()
    val remainder = RemainderOperation()

    val addCalculator = Calculator(add)
    val subtractCalculator = Calculator(subtract)
    val multiplyCalculator = Calculator(multiply)
    val divideCalculator = Calculator(divide)
    val remainderCalculator = Calculator(remainder)


    println("1 더하기 2 결과는 : ${addCalculator.calc(1, 2)} 입니다")
    println("1 빼기 2 결과는 : ${subtractCalculator.calc(1, 2)} 입니다")
    println("4 나누기 2 결과는 : ${divideCalculator.calc(4, 2)} 입니다")
    println("1 곱하기 2 결과는 : ${multiplyCalculator.calc(1, 2)} 입니다")
    println("1과 2의 나머지연산 결과는 : ${remainderCalculator.calc(1, 2)} 입니다")
}