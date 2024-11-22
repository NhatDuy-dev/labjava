
package bailab4;

import java.util.*;
public class dem {
    public static void main(String[] args) {
       
     Scanner scanner = new Scanner(System.in);
        System.out.print("nhap so phan tu mang: ");
        int number = scanner.nextInt();
        int[] mang = new int[number];
        int dem=0;
        for (int i = 0; i < number; i++) {
            System.out.print("phan tu thu " + i + " :");
            mang[i] = scanner.nextInt();
        }
        System.out.print("nhap so ban muon dem: ");
        int x= scanner.nextInt();
            for(int i=0;i<number;i++){
                if(mang[i]==x){
                    dem++;
            }
        }
            System.out.print("so lan xuat hien cua "+x+" trong mang:"+dem);
    }
}
