
package bailab5;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
public class addArraylist {
public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("nhap so phan tu trong mang: ");
        int a= scanner.nextInt();
        scanner.nextLine();
        String[] mang=new String[a];
        for(int i=0;i<a;i++){
             System.out.print("phan tu thu "+i+": ");
             mang[i] = scanner.nextLine();
        }
        
    }
    
}
