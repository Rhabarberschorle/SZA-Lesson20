package Lesson7;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadAndStoreInMap {
    public static void main(String[] args) throws IOException {
        File file = new File("src/main/java/lesson07/cities_small.csv");

        List<String> strings = getStringsFromFile(file);
        Map<Integer, Map<String, String>> cities = castLinesToMap(strings);
        printResult(cities);
    }

    private static List<String> getStringsFromFile(File fileToRead) throws IOException {
        return FileUtils.readLines(fileToRead, Charset.defaultCharset());
    }

    private static Map<Integer, Map<String, String>> castLinesToMap(List<String> data) {
        Map<Integer, Map<String, String>> result = new HashMap<>();

        for (int i=1; i< data.size(); i++) {
            String[] split = data.get(i).split(",");

            Integer index = Integer.parseInt(split[0]);

            Map<String, String> city = new HashMap<>();
            city.put("City", split[1]);
            city.put("State", split[2]);

            result.put(index, city);

        }
        return result;
    }

    public static void printResult( Map<Integer, Map<String, String>> cities) {
        for( Map.Entry<Integer, Map<String, String>> city : cities.entrySet()) {
            System.out.printf("%s ---- %s %s \n",
                    city.getKey(),
                    city.getValue().get("City"),
                    city.getValue().get("State"));
        }
    }
}
