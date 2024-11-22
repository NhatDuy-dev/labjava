package pkgwhile;
import java.util.Scanner;
import java.util.Random;
public class While {
    public static void main(String[] args) {
     Random random = new Random();
     int r = random.nextInt(50) + 1; 
     Scanner scanner = new Scanner(System.in);
     while(true){
     System.out.print("Doan 1 so tu 1-50: ");
     int a = scanner.nextInt();
         if(a>r){
             System.out.println("so cua ban lon hon so du doan ");
         }else if(a<r){
             System.out.println("so cua ban nho hon so du doan");
         }else{
             System.out.println("ban da doan dung");
             break;
         }
      }
     scanner.close();
    }
}
