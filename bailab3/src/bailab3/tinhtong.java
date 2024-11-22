package bailab3;

import java.util.Scanner;

public class tinhtong {

    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap day so bat ki: ");
        int a = scanner.nextInt();
        int t = 0;
        while (a > 0) {
            int c = a % 10;
            t += c;
            a /= 10;
        }
        System.out.print("tong cua day so: " + t);
    }
}
