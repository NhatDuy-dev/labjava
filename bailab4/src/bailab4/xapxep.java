package bailab4;

import java.util.*;

public class xapxep {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap so phan tu mang: ");
        int number = scanner.nextInt();
        int[] mang = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.print("phan tu thu " + i + " :");
            mang[i] = scanner.nextInt();
        }
        for (int i = 0; i < number - 1; i++) {
            for (int j = i + 1; j > i; j--) {
                if (mang[j - 1] > mang[j]) {
                    int temp = mang[i];
                    mang[i] = mang[j];
                    mang[j] = temp;
                }
            }
        }
        System.out.println("Mang khi duoc sap xep tang dan:");
        for (int i = 0; i < number; i++) {
            System.out.print(mang[i] + " ");
        }
    }
}
