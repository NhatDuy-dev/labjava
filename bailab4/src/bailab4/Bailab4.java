package bailab4;

import java.util.*;

public class Bailab4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap so ngay muon xem nhiet do: ");
        int day = scanner.nextInt();
        int[] temp = new int[day];
        int sum = 0;
        for (int i = 0; i < day; i++) {
            System.out.print("Day " + (i + 1) + "'s high temp: ");
            temp[i] = scanner.nextInt();
            sum += temp[i];  
        }
        double average = (double) sum / day;
        int count = 0;
        for (int i = 0; i < day; i++) {
            if (temp[i] > average) {
             count++;
            }
        }
        System.out.printf("Average temp = %.1f\n", average);
        System.out.println(count + " day(s) above average");
        
        scanner.close();  
}
}