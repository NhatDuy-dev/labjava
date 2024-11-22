
package example;

  public class Student{
    public static void main(String[] args) {
        Example example = new Example();
        Example.Student student1=example.new Student(1,"Nam");
        Example.Student student2=example.new Student(2,"Vu");
        student1.displayInformation();   
        student2.displayInformation(); 
    }
  }