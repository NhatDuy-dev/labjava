package student;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student {
    String studentId;
    String fullName;
    String dateOfBirth;
    String major;
    float gpa;

    public void enterStudentInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap Ma Sinh Vien: ");
        studentId = scanner.nextLine();
        System.out.print("Nhap Ho Va Ten: ");
        fullName = scanner.nextLine();
        System.out.print("Nhap Ngay Sinh (YYYY-MM-DD): ");
        dateOfBirth = scanner.nextLine();
        System.out.print("Nhap Nganh Hoc: ");
        major = scanner.nextLine();
        System.out.print("Nhap GPA: ");
        gpa = scanner.nextFloat();
    }

     public void displayStudentInfo() {
        System.out.println("Ma Sinh Vien: " + studentId);
        System.out.println("Ho Va Ten: " + fullName);
        System.out.println("Ngay Sinh: " + dateOfBirth);
        System.out.println("Nganh Hoc: " + major);
        System.out.println("GPA: " + gpa);
    }
}

