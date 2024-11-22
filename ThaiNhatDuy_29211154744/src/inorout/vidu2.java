package inorout;

import java.util.Scanner;

public class vidu2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten cua ban: ");
        String ten = scanner.nextLine();
        System.out.print("Nhap tuoi: ");
        int number = scanner.nextInt();
        System.out.print("Nhap nam sinh: ");
        int nam = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhap gioi tinh: ");
        String gioitinh = scanner.nextLine();
        System.out.print("GPA: ");
        float diem = scanner.nextFloat();
        scanner.nextLine();
        System.out.print("nhap noi o: ");
        String que = scanner.nextLine();
        System.out.println("ten cua ban: " + ten);
        System.out.println("noi o cua ban :" + que);
        System.out.println("gioi tinh cua ban: " + gioitinh);
        System.out.println("GPA: " + diem);
        System.out.println("tuoi: " + number);
        System.out.println("nam sinh: " + nam);
        scanner.close();
    }
}
