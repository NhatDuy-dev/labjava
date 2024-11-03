package baitapdieukien;
import java.util.Scanner;
import java.lang.Math;
public class bac2 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
        System.out.print("nhap gia tri a: ");
        Double a = scanner.nextDouble();
        System.out.print("nhap gia tri b: ");
        Double b = scanner.nextDouble();
        System.out.print("nhap gia tri c: ");
        Double c = scanner.nextDouble();
        Double d;
        d=b*b-4*a*c;
        System.out.print("denta cua phuong trinh: "+d);
        if(d<0){
            System.out.println("phuong trinh vo nghiem");
        }else if(d==0){
            Double f;
            f= -b/2*a;
            System.out.println("\nphuong trinh co nghiem kep :"+f);
        }else if(d>0){
            Double x1;
            x1=(-b+Math.sqrt(d))/2*a;
            Double x2;
            x2=(-b-Math.sqrt(d))/2*a;
            System.out.print("\nnghiem x1: "+x1);
            System.out.print("\nnghiem x2: "+x2);
            scanner.close();
        }
   }
}