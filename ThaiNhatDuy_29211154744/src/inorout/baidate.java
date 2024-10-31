package inorout;
import java.text.ParseException;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
public class baidate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap ten: ");
        String ten = scanner.nextLine();

        System.out.print("Nhap tuoi: ");
        int tuoi = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("nhap ngay thang nam sinh(dd/MM/yyyy): ");
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date(0);
        try {
            date = df.parse(scanner.nextLine());

        } catch (ParseException ex) {
            Logger.getLogger(baidate.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.print("Nhap gioi tinh: ");
        String gioiTinh = scanner.nextLine();

        System.out.print("Nhap chuyen nganh: ");
        String chuyenNganh = scanner.nextLine();

        System.out.print("Nhap GPA: ");
        double gpa = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Nhap que quan: ");
        String queQuan = scanner.nextLine();

        System.out.println("\n--- Thong Tin Ca Nhan ---");
        System.out.println("Ten: " + ten);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Date :" + df.format(date));
        System.out.println("Gioi tinh: " + gioiTinh);
        System.out.println("Chuyen nganh: " + chuyenNganh);
        System.out.println("GPA: " + gpa);
        System.out.println("Que quan: " + queQuan);
        scanner.close();
    }
}
