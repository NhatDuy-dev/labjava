package kiemtra;

import java.util.Scanner;

public class chuoipalindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap chuoi: ");
        String ch = scanner.nextLine();
        String dao = "";
        for (int i = ch.length() - 1; i >= 0; i--) {
            dao += ch.charAt(i);
        }
        if (ch.equals(dao)) {
            System.out.println("Chuoi palindrome");
        } else {
            System.out.println("Chuoi khong phai la palindrome");
        }

    }
}
