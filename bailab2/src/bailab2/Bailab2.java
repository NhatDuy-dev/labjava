package bailab2;

import java.util.Scanner;

public class Bailab2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap gia tri a: ");
        Double a = scanner.nextDouble();
        System.out.print("nhap gia tri b: ");
        Double b = scanner.nextDouble();
        if (a==0) {
            if (b==0) {
                System.out.print("phuong trinh vo so nghiem");
            } else {
                System.out.print("phuong trinh vo nghiem");
            }
        } else {
            Double x=-b/a;
            System.out.print("phuong trinh co nghiem x= " + x);
        }
        scanner.close();
    }
}
