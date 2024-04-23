import util.ExpressionUtils.calculatePostfix
import util.ExpressionUtils.toPostfix

fun main() {
    while (true) {
        println("계산식을 입력해주세요 (엔터키를 누르면 프로그램이 종료됩니다.):")
        val input = readlnOrNull() ?: break

        try {
            if (input.isBlank()) {
                break
            }
            val postfix = toPostfix(input)
            val result = calculatePostfix(postfix)
            println("결과값: $result")
        } catch (e: Exception) {
            println("지원되는 연산자를 사용해주세요. ('+','-','%','/','*')")
        }
    }
}