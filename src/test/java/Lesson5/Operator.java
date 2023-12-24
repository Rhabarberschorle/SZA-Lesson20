package Lesson5;

public enum Operator {
    PLUS("+"),
    MINUS("-"),
    MULTIPLICATION("*"),
    DIVISION("/"),
    REMAINDER("%");

//    public static String Operator;
    private final String value;

    Operator(String symbol) {
        this.value = symbol;
    }

    public String getValue() {
        return value;
    }
}
