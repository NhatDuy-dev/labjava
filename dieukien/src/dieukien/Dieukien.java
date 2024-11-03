package dieukien;
import java.util.Scanner;
public class Dieukien {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
       System.out.print("Nhap so bat ki: ");
      int nguyen = scanner.nextInt();
      if (nguyen>=90){
          System.out.println("you got an A");
      }
      else if (nguyen>=80){
          System.out.println("you got an B");
    }
      else if (nguyen>=70){
          System.out.println("you got an C");
    }
    else if (nguyen>=60){
          System.out.println("you got an D");
    }
    else if (nguyen<50){
          System.out.println("you got an F");
    }
  }
}
