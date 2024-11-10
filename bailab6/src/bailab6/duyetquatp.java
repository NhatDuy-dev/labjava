package bailab6;

import java.util.ArrayList;
import java.util.Scanner;

public class duyetquatp {

    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten cua 5 thanh pho:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nhap ten thanh pho " + (i + 1) + ": ");
            String city = scanner.nextLine();
            cities.add(city);
        }
        scanner.close();
        System.out.println("Danh sach thanh pho:");
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
