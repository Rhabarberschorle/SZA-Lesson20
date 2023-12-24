package Lesson5;

import java.util.List;

public class CalculatorFunctions {


    static int a;
    static int b;
    static int result;
    static String symbol;

    public static Integer calculateResult(List<String> operation) {

        a = Integer.parseInt(operation.get(0));
        b = Integer.parseInt(operation.get(2));
        symbol = operation.get(1);
        Operator operator = getOperator(symbol);

        switch (operator) {
            case PLUS:
                result = a + b;
                break;
            case MINUS:
                result = a - b;
                break;
            case DIVISION:
                if(b == 0) {
                    return null;
                } else {
                    result = a / b;
                    break; 
                }
            case REMAINDER:
                result = a % b;
                break;
            case MULTIPLICATION:
                result = a * b;
                break;
        }
        return result;
    }

    public static String prepareResults(List<String> operation, double result) {
        a = Integer.parseInt(operation.get(0));
        b = Integer.parseInt(operation.get(2));
        symbol = operation.get(1);
        return (a + symbol + b + "=" + result);
    }

    private static Operator getOperator(String symbol) {
        switch (symbol) {
            case "+":
                return Operator.PLUS;
            case "-":
                return Operator.MINUS;
            case "*":
                return Operator.MULTIPLICATION;
            case "/":
                return Operator.DIVISION;
            case "%":
                return Operator.REMAINDER;
            default:
                throw new IllegalArgumentException("Invalid operator: " + symbol);
        }
    }
}
