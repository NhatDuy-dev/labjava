
package student;

import java.util.Scanner;

public class processor {
      public static void main(String[] args) {
        StudentList studentList = new StudentList();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("He Thong Quan Ly Sinh Vien:");
            System.out.println("1. Them Sinh Vien");
            System.out.println("2. Hien Thi Tat Ca Sinh Vien");
            System.out.println("3. Tim Sinh Vien Theo ID");
            System.out.println("4. Xoa Sinh Vien Theo ID");
            System.out.println("5. Chinh Sua Sinh Vien Theo ID");
            System.out.println("6. Thoat");
            System.out.print("Nhap lua chon: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Loai bo ky tu xuong dong

            switch (choice) {
                case 1:
                    Student student = new Student();
                    student.enterStudentInfo();
                    studentList.studentList.add(student);
                    break;
                case 2:
                    studentList.displayAllStudents();
                    break;
                case 3:
                    System.out.print("Nhap Ma Sinh Vien Can Tim: ");
                    String idToFind = scanner.nextLine();
                    Student foundStudent = studentList.findStudentById(idToFind);
                    if (foundStudent != null) {
                        foundStudent.displayStudentInfo();
                    } else {
                        System.out.println("Khong tim thay sinh vien.");
                    }
                    break;
                case 4:
                    System.out.print("Nhap Ma Sinh Vien Can Xoa: ");
                    String idToDelete = scanner.nextLine();
                    if (studentList.deleteStudentById(idToDelete)) {
                        System.out.println("Xoa sinh vien thanh cong.");
                    } else {
                        System.out.println("Khong tim thay sinh vien.");
                    }
                    break;
                case 5:
                    System.out.print("Nhap Ma Sinh Vien Can Chinh Sua: ");
                    String idToEdit = scanner.nextLine();
                    if (studentList.editStudentById(idToEdit)) {
                        System.out.println("Chinh sua sinh vien thanh cong.");
                    } else {
                        System.out.println("Khong tim thay sinh vien.");
                    }
                    break;
                case 6:
                    System.out.println("Thoat...");
                    break;
                default:
                    System.out.println("Lua chon khong hop le! Vui long thu lai.");
            }
        } while (choice != 6);

        scanner.close();
    }
}