
package student;

import java.util.ArrayList;

public class StudentList {
  ArrayList<Student> danhSachSinhVien = new ArrayList<>();

    public void hienThiTatCaSinhVien() {
        if (danhSachSinhVien.isEmpty()) {
            System.out.println("Khong co sinh vien nao.");
        } else {
            for (Student student : danhSachSinhVien) {
                student.hienThiThongTinSinhVien();
                System.out.println("------------------------");
            }
        }
    }

    public Student timSinhVienTheoId(String idCanTim) {
        for (Student student : danhSachSinhVien) {
            if (student.studentId.equals(idCanTim)) {
                return student;
            }
        }
        return null;
    }

    public boolean xoaSinhVienTheoId(String idCanXoa) {
        Student student = timSinhVienTheoId(idCanXoa);
        if (student != null) {
            danhSachSinhVien.remove(student);
            return true;
        }
        return false;
    }

    public boolean suaSinhVienTheoId(String idCanSua) {
        Student student = timSinhVienTheoId(idCanSua);
        if (student != null) {
            System.out.println("Sua thong tin sinh vien:");
            student.nhapThongTinSinhVien();
            return true;
        }
        return false;
    }
}
