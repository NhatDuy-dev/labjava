package bailab4;

import java.util.*;

public class tingtongtrungbinh {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap so phan tu mang: ");
        int number = scanner.nextInt();
        int[] temp = new int[number];
        int sum = 0;
        for (int i = 0; number > i; i++) {
            System.out.print("phan tu thu " + i + " :");
            temp[i] = scanner.nextInt();
            sum += temp[i];
        }
        double trungbinh = (double) sum / number;
        System.out.println("tong cua cac phan tu trong mang: " + sum);
        System.out.println("tong cua cac phan tu trong mang: " + trungbinh);
    }
}
