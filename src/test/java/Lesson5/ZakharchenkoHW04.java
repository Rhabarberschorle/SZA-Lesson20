package Lesson5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Lesson5.CalculatorFunctions.calculateResult;
import static Lesson5.CalculatorFunctions.prepareResults;

public class ZakharchenkoHW04 {

    static List<String> operation = new ArrayList<>();
    static double result;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first operand");
        String a = input.next();
        operation.add(a);
        System.out.println("Enter second operand");
        String b = input.next();
        System.out.println("Enter operator");
        String operator = input.next();
        operation.add(operator);
        operation.add(b);
        result = calculateResult(operation);
        System.out.println(prepareResults(operation, result));
    }
}
