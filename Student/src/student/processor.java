
package student;

import java.util.Scanner;

public class processor {
    public static void main(String[] args) {
        StudentList danhSach = new StudentList();
        Scanner scanner = new Scanner(System.in);
        int luaChon;

        do {
            System.out.println("He Thong Quan Ly Sinh Vien:");
            System.out.println("1. Them Sinh Vien");
            System.out.println("2. Hien Thi Tat Ca Sinh Vien");
            System.out.println("3. Tim Sinh Vien Theo ID");
            System.out.println("4. Xoa Sinh Vien Theo ID");
            System.out.println("5. Sua Sinh Vien Theo ID");
            System.out.println("6. Thoat");
            System.out.print("Nhap lua chon: ");
            luaChon = scanner.nextInt();
            scanner.nextLine(); // Loai bo ky tu xuong dong

            switch (luaChon) {
                case 1:
                    Student student = new Student();
                    student.nhapThongTinSinhVien();
                    danhSach.danhSachSinhVien.add(student);
                    break;
                case 2:
                    danhSach.hienThiTatCaSinhVien();
                    break;
                case 3:
                    System.out.print("Nhap Ma Sinh Vien Can Tim: ");
                    String idCanTim = scanner.nextLine();
                    Student sinhVienTimThay = danhSach.timSinhVienTheoId(idCanTim);
                    if (sinhVienTimThay != null) {
                        sinhVienTimThay.hienThiThongTinSinhVien();
                    } else {
                        System.out.println("Khong tim thay sinh vien.");
                    }
                    break;
                case 4:
                    System.out.print("Nhap Ma Sinh Vien Can Xoa: ");
                    String idCanXoa = scanner.nextLine();
                    if (danhSach.xoaSinhVienTheoId(idCanXoa)) {
                        System.out.println("Da xoa sinh vien thanh cong.");
                    } else {
                        System.out.println("Khong tim thay sinh vien.");
                    }
                    break;
                case 5:
                    System.out.print("Nhap Ma Sinh Vien Can Sua: ");
                    String idCanSua = scanner.nextLine();
                    if (danhSach.suaSinhVienTheoId(idCanSua)) {
                        System.out.println("Da sua thong tin sinh vien thanh cong.");
                    } else {
                        System.out.println("Khong tim thay sinh vien.");
                    }
                    break;
                case 6:
                    System.out.println("Thoat chuong trinh...");
                    break;
                default:
                    System.out.println("Lua chon khong hop le! Vui long thu lai.");
            }
        } while (luaChon != 6);

        scanner.close();
    }
}