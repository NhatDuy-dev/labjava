package kiemtra;

import java.util.Scanner;

public class viethoa {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap chuoi: ");
        String ch = scanner.nextLine();
        String sau = "";
        for (int i = 0; i < ch.length(); i++) {
            char l = ch.charAt(i);
            if (l >= 'A' && l <= 'Z') {
                sau += (char) (l + 32);
            } else if (l >= 'a' && l <= 'z') {
                sau += (char) (l - 32);
            } else {
                sau += l;
            }
        }        
        System.out.print("chuoi sau khi duoc chinh: " + sau);
    }
}
