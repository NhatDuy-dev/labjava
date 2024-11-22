
package example;

public class Example {
     public class Student {
        private int id;
        private String name;
        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }
        public void displayInformation() {
            System.out.println("Student ID: " + id + ", Name: " + name);
        }
     }
}