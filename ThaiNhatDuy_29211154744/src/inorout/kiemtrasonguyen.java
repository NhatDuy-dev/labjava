package inorout;
import java.util.Scanner;
public class kiemtrasonguyen {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so: "); 
        System.out.println(scanner.hasNextInt());
        scanner.close();
    }
    
}
