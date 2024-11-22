package student;

import java.util.ArrayList;

public class StudentList {

    ArrayList<Student> studentList = new ArrayList<>();

    public void displayAllStudents() {
        if (studentList.isEmpty()) {
            System.out.println("Khong co sinh vien nao.");
        } else {
            for (Student student : studentList) {
                student.displayStudentInfo();
                System.out.println("------------------------");
            }
        }
    }

    public Student findStudentById(String idToFind) {
        for (Student student : studentList) {
            if (student.studentId.equals(idToFind)) {
                return student;
            }
        }
        return null;
    }

    public boolean deleteStudentById(String idToDelete) {
        Student student = findStudentById(idToDelete);
        if (student != null) {
            studentList.remove(student);
            return true;
        }
        return false;
    }

    public boolean editStudentById(String idToEdit) {
        Student student = findStudentById(idToEdit);
        if (student != null) {
            System.out.println("Chinh sua thong tin sinh vien:");
            student.enterStudentInfo();
            return true;
        }
        return false;
    }
}
