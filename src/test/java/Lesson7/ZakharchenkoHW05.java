package Lesson7;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZakharchenkoHW05 {
    public static void main(String[] args) throws IOException {
        File file = new File("src/test/java/Lesson7/cities_small.csv");
        //exercise 1
        Map<Integer, String> cities = (getDataFromFile(file));
        printResult(cities);
        //exercise 2
        Integer id = 34;
        System.out.println(getDataById(cities, id));
        //exercise 3
        System.out.println(getNumberOfOccurrences(cities, "Wilmington"));
    }

    private static List<String> getStringsFromFile(File fileToRead) throws IOException {
        return FileUtils.readLines(fileToRead, Charset.defaultCharset());
    }

    private static Map<Integer, String> getDataFromFile(File dataFile) throws IOException {
        Map<Integer, String> cities = new HashMap<>();
        List<String> strings = getStringsFromFile(dataFile);
        for (int i = 1; i < strings.size(); i++) {
            String[] split = strings.get(i).split(",");
            Integer index = Integer.parseInt(split[0]);
            String city = split[1];
            cities.put(index, city);
        }
        return cities;
    }

    private static String getDataById(Map<Integer, String> mapData, Integer id) {
        return mapData.get(id);
    }

    private static int getNumberOfOccurrences(Map<Integer, String> mapData, String city) {
        int totalCount = 0;
        for (String value : mapData.values()) {
            if (value.equals(city)) {
                totalCount++;
            }
        }
        return totalCount;
    }

    public static void printResult(Map<Integer, String> cities) {
        for (Map.Entry<Integer, String> city : cities.entrySet()) {
            System.out.printf("%s ---- %s \n",
                    city.getKey(),
                    city.getValue());
        }
    }
}
