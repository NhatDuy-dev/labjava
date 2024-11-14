package kiemtra;

import java.util.Scanner;

public class Kiemtra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap chuoi: ");
        String ch = scanner.nextLine();
        System.out.print("nhap tu muon dem: ");
        char m = scanner.nextLine().charAt(0);
        int dem = 0;
        for (int i = 0; i < ch.length(); i++) {

            if (ch.charAt(i) == m) {
                dem++;
            }
        }
        System.out.print("so lan tu " + m + " xuat hien trong chuoi: " + dem);
    }

}
