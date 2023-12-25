package Lesson22.ZakharchenkoHW17;

import java.util.*;

public class CollectionExercisesPart2 {
    public static void main(String[] args) {
        //Exercise 8
        List<String> listOfCities = new ArrayList<>();
        listOfCities.add("Kyiv");
        listOfCities.add("Odessa");
        listOfCities.add("Kharkiv");
        listOfCities.add("Lviv");
        listOfCities.add("Kharkiv");

        Collection<String> uniqueStrings = removeDuplicates(listOfCities);
        System.out.println("Unique Strings: " + uniqueStrings);

        //Exercise 9
        List<String> stringList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter a string in one row, e.g. \"one flew over cuckoo's nest\"" + (i + 1) + ": ");
            String inputString = scanner.nextLine();
            stringList.add(inputString);
        }
        scanner.close();

        List<String> longestStrings = findLongestStrings(stringList);

        System.out.println("The longest string(s):");
        for (String longestString : longestStrings) {
            System.out.println(longestString);


            //Exercise 10
            List<String> stringListWithNewOrder = new ArrayList<>();
            Scanner scanner2 = new Scanner(System.in);

            for (int i = 0; i < 3; i++) {
                System.out.print("Enter a string in one row, e.g. \"one flew over cuckoo's nest\"" + (i + 1) + ": ");
                String inputString = scanner2.nextLine();
                stringListWithNewOrder.add(0, inputString);
            }
            for (String separateString : stringListWithNewOrder) {
                System.out.println(separateString);
            }
            scanner2.close();
        }
    }

    public static <T> Set<T> removeDuplicates(Collection<T> inputCollection) {
        return new LinkedHashSet<>(inputCollection);
    }

    private static List<String> findLongestStrings(List<String> strings) {
        List<String> longestStrings = new ArrayList<>();
        int maxLength = 0;

        for (String str : strings) {
            int length = str.length();

            if (length > maxLength) {
                maxLength = length;
                longestStrings.clear();
                longestStrings.add(str);
            } else if (length == maxLength) {
                longestStrings.add(str);
            }
        }
        return longestStrings;
    }
}
