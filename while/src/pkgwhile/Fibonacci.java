package pkgwhile;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu : ");
        int n = scanner.nextInt();
        int a = 0, b = 1;
        System.out.print("Day Fibonacci: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a);
            if (i < n - 1) {
                System.out.print(", ");
            }int next = a + b;
            a = b;
            b = next;
        }
        scanner.close();
    }
}
