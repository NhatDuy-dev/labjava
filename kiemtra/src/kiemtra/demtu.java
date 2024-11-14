package kiemtra;

import java.util.Scanner;

public class demtu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String ch = scanner.nextLine();
        int demtu = 0;
        boolean tu = false;
        for (int i = 0; i < ch.length(); i++) {
            char l = ch.charAt(i);
            if (l != ' ') {
                if (!tu) {
                    demtu++;
                    tu = true;
                }
            } else {
                tu = false;
            }
        }
        System.out.println("Số từ trong chuỗi là: " + demtu);
    }
}
