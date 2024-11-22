package bailab2;

import java.util.Scanner;

public class bac2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap gia tri a: ");
        Double a = scanner.nextDouble();
        System.out.print("nhap gia tri b: ");
        Double b = scanner.nextDouble();
        System.out.print("nhap gia tri c: ");
        Double c = scanner.nextDouble();
        Double d;
        d = b * b - 4 * a * c;
        System.out.println(" gia tri denta: " + d);
        if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Phuong tinh co hai nghiem phan biet: x1 = " + x1);
            System.out.println("Phuong tinh co hai nghiem phan biet: x2 = " + x2);
        } else if (d == 0) {
            double x = -b / (2 * a);
            System.out.println("Phuong trinh co nghiem kep: x = " + x);
        } else {
            System.out.println("Phuong trinh vo nghiem");
        }
        scanner.close();
    }
}
