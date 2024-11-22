package kiemtra;

import java.util.Scanner;

public class tudainhat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String ch = scanner.nextLine();
        String longs = "";
        int max = 0;
        String tudai = "";
        for (int i = 0; i < ch.length(); i++) {
            char currentChar = ch.charAt(i);
            if (currentChar != ' ') {
                tudai += currentChar;
            } else {
                if (tudai.length() > max) {
                    max = tudai.length();
                    longs = tudai;
                }
                tudai = "";
            }
        }
        if (tudai.length() > max) {
            longs = tudai;
        }
        System.out.println("tu dai nhat la: " + longs);
    }
}
