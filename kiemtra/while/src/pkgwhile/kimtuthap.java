
package pkgwhile;
import java.util.Scanner;
public class kimtuthap {
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap so cot kim tu thap: ");
        int a= scanner.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
             System.out.println();
        }
    }
}
