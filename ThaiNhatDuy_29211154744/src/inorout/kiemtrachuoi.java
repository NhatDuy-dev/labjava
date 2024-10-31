package inorout;

import java.util.Scanner;

public class kiemtrachuoi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi: "); 
        System.out.println(scanner.hasNext());
        scanner.close();
    }
}
