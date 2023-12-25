package Lesson22.ZakharchenkoHW17;

import java.util.Map;

public class Pet {
    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void printPetNames(Map<String, Pet> map) {
        System.out.println("Pet Names:");
        for (String key : map.keySet()) {
            System.out.println(key);
        }
    }
}
