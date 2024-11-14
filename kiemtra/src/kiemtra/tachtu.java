package kiemtra;

import java.util.Scanner;

public class tachtu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap chuoi: ");
        String ch = scanner.nextLine();
        String[] tuA = ch.trim().split("\\s");
        System.out.println("sau khi tach: ");
        for (String tu : tuA) {
            System.out.println(tu);
        }
    }
}
