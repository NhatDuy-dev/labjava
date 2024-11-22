package bailab6;

import java.util.ArrayList;
import java.util.Collections;


public class sapxep {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(7);
        numbers.add(4);
        numbers.add(2);

        Collections.sort(numbers);

        System.out.println("Danh sach sau khi sap xep: " + numbers);
    }
}
