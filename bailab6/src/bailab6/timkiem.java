package bailab6;

import java.util.ArrayList;

public class timkiem {

    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("JavaScript");

        String timkiem = "Python";
        if (languages.contains(timkiem)) {
            System.out.println(timkiem + " co trong danh sach.");
        } else {
            System.out.println(timkiem + " khong co trong danh sach.");
        }
    }
}
