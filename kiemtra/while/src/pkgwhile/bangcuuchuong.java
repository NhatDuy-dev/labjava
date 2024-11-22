package pkgwhile;

import java.util.Scanner;

public class bangcuuchuong {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap bang cuu chuong ban muon in ra : ");
        int a = scanner.nextInt();
        for (int i = 1; i <= 9; i++) {
            System.out.println(a + "x" + i + "=" + (i * a));
        }
    }
}
