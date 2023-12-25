package Lesson22.ZakharchenkoHW17;

import java.util.*;

import static Lesson22.ZakharchenkoHW17.Pet.printPetNames;
import static Lesson22.ZakharchenkoHW17.Toy.*;

public class CollectionExercisesPart1 {
    public static void main(String[] args) {
        //Exercise 5
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers in one row, e.g. \"1, 2, 3, 4, 4, 5\": ");
        String input = scanner.nextLine();
        scanner.close();

        String[] numbersArray = input.split(",\\s*");

        Set<String> uniqueNumbersSet = new HashSet<>(Arrays.asList(numbersArray));

        System.out.println("New set with unique numbers " + String.join(", ", uniqueNumbersSet));

        //Exercise 6
        Map<String, Toy> toyMap = new HashMap<>();
        toyMap.put("Bicycle", new Toy("Bicycle", 159.99));
        toyMap.put("Buggy", new Toy("Buggy", 99.99));
        toyMap.put("Truck", new Toy("Truck", 56));

        printEntries(toyMap);
        printKeys(toyMap);
        printValues(toyMap);

        //Exercise 7
        Map<String, Pet> petMap = new HashMap<>();

        petMap.put("Fray", new Cat("Fray"));
        petMap.put("Mister", new Dog("Mister"));

        printPetNames(petMap);
    }
}
