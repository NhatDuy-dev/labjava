package baitapdieukien;
import java.util.Scanner;
public class Baitapdieukien {
  public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.print("nhap gia tri a: ");
        Double a = scanner.nextDouble();
        System.out.print("nhap gia tri b: ");
        Double b = scanner.nextDouble();
        if(a==0){
            if(b==0){
                System.out.print("phuong trinh vo nghiem");
            }else{
               System.out.print("phuong trinh vo nghiem");
                scanner.close();
            } 
        }else{
              Double Ng; 
              Ng=-b/a;
                System.out.print("nghiem phuon trinh: "+Ng);
            }      
          
  }    
}
