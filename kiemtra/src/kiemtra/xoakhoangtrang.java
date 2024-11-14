package kiemtra;

import java.util.Scanner;

public class xoakhoangtrang {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap chuoi: ");
        String ch = scanner.nextLine();
        String xoa = "";
        for (int i = 0; i < ch.length(); i++) {
            if (ch.charAt(i) != ' ') {
                xoa += ch.charAt(i);
            }
        }
        System.out.print("sau khi xoa khoang trang chuoi: " + xoa);
    }
}
