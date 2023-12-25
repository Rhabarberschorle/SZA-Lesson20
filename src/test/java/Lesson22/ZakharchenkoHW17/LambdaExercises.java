package Lesson22.ZakharchenkoHW17;

public class LambdaExercises {
    public static void main(String[] args) {
        //Exercise 1
        IsDivisible divisibleByThirteen = number ->
        {
            return number % 13 == 0;
        };
        System.out.println(divisibleByThirteen.test(26));

        //Exercise 2
        CompareStrings compareStrings = (a, b) ->
        {
            if (a.compareTo(b) < 0) {
                return b;
            } else if (a.compareTo(b) == 0) {
                return "Strings are equal";
            } else {
                return a;
            }
        };
        System.out.println(compareStrings.compare("Abc", "Abcd"));

        //Exercise 3
        DiscriminantCalculator discriminantCalculator = (a, b, c) -> b * b - 4 * a * c;
        double a = 4.0;
        double b = 1.5;
        double c = -2.0;
        double discriminant = discriminantCalculator.calculateResult(a, b, c);
        System.out.println("Discriminant: " + discriminant);

        //Exercise 4
        DiscriminantCalculator updatedDiscriminantCalculator = (x, y, z) -> x * Math.pow(y, z);
        double x = 4.0;
        double y = 1.5;
        double z = -2.0;
        double result = updatedDiscriminantCalculator.calculateResult(x, y, z);
        System.out.println("Updated result " + result);
    }

    //interfaces
    @FunctionalInterface
    interface Operator<T> {
        T process(T a, T b);
    }

    @FunctionalInterface
    interface IsDivisible {
        boolean test(int number);
    }

    @FunctionalInterface
    interface CompareStrings {
        String compare(String a, String b);
    }

    @FunctionalInterface
    interface DiscriminantCalculator {
        double calculateResult(double a, double b, double c);
    }
}
