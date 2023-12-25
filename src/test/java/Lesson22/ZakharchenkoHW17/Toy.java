package Lesson22.ZakharchenkoHW17;

import java.util.Map;

public class Toy {
    private String name;
    private double price;

    public Toy(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public static void printEntries(Map<String, Toy> map) {
        System.out.println("Entries:");
        for (Map.Entry<String, Toy> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println();
    }

    public static void printKeys(Map<String, Toy> map) {
        System.out.println("Keys:");
        for (String key : map.keySet()) {
            System.out.println(key);
        }
        System.out.println();
    }

    public static void printValues(Map<String, Toy> map) {
        System.out.println("Values:");
        for (Toy toy : map.values()) {
            System.out.println(toy.price);
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return String.format("Toy name='" + name + '\'' + ", price=" + price);
    }
}
