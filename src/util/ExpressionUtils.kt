package util

import operations.AddOperation
import Calculator
import operations.DivideOperation
import operations.MultiplyOperation
import operations.RemainderOperation
import operations.SubtractOperation
import java.util.*

object ExpressionUtils {
    fun priority(op: Char): Int {
        return when (op) {
            '+', '-' -> 1
            '*', '/', '%' -> 2
            else -> -1
        }
    }

    fun calculateOperation(a: Long, b: Long, op: Char): Long {
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

        return when (op) {
            '+' -> addCalculator.calc(a, b)
            '-' -> subtractCalculator.calc(a, b)
            '*' -> multiplyCalculator.calc(a, b)
            '/' -> divideCalculator.calc(a, b)
            '%' -> remainderCalculator.calc(a, b)
            else -> 0
        }
    }

    fun toPostfix(expression: String): String {
        val output = StringBuilder()
        val operators = Stack<Char>()
        var i = 0
        var lastWasOperator = false // 연산자 바로 뒤에 위치하는지 확인

        while (i < expression.length) {
            val c = expression[i]

            if (c.isDigit()) {
                lastWasOperator = false
                while (i < expression.length && expression[i].isDigit()) {
                    output.append(expression[i])
                    i++
                }
                output.append(' ')
            } else if (c == '(') {
                operators.push(c)
                i++
            } else if (c == ')') {
                while (operators.peek() != '(') {
                    output.append(operators.pop()).append(' ')
                }
                operators.pop()
                i++
            } else if (c == '+' || c == '-' || c == '*' || c == '/' || c == '%') {
                if (c == '-' && (i == 0 || lastWasOperator)) {
                    output.append("0 ")
                }
                while (!operators.isEmpty() && !lastWasOperator && priority(operators.peek()) >= priority(c)) {
                    output.append(operators.pop()).append(' ')
                }
                operators.push(c)
                lastWasOperator = true
                i++
            } else {
                i++
            }
        }

        while (!operators.isEmpty()) {
            output.append(operators.pop()).append(' ')
        }
        return output.toString()
    }

    fun calculatePostfix(postfix: String): Long {
        val stack = Stack<Long>()
        var i = 0

        while (i < postfix.length) {
            val c = postfix[i]

            if (c.isDigit()) {
                var num: Long = 0
                while (i < postfix.length && postfix[i].isDigit()) {
                    num = num * 10 + (postfix[i] - '0').toLong()
                    i++
                }
                stack.push(num)
            } else if (c == '+' || c == '-' || c == '*' || c == '/' || c == '%') {
                val val2 = stack.pop()
                val val1 = stack.pop()
                stack.push(calculateOperation(val1, val2, c))
            }
            i++
        }

        return stack.pop()
    }
}
