    package bailab3;

import java.util.Scanner;

public class Bailab3 {

    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    break;
                } else if (j + 1 > Math.sqrt(i)) {
                    System.out.println("so nguyen to:" + i);
                }
            }
        }
    }
}
