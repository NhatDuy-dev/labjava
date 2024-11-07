package bailab4;

import java.util.*;

public class manglonnho {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap so phan tu mang: ");
        int number = scanner.nextInt();
        int[] mang = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.print("phan tu thu " + i + " :");
            mang[i] = scanner.nextInt();
        }
        int max = mang[0];
        for (int i = 0; i < number; i++) {
            if (mang[i] > max) {
                max = mang[i];
            }
        }
        int min = mang[0];
        for (int i = 0; i < number; i++) {
            if (mang[i] < min) {
                min = mang[i];
            }
        }
        System.out.println(" phan tu lon nhat trong mang: " + max);
        System.out.println(" phan tu nho nhat trong mang: " + min);
    }
}
