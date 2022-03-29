import model.Student;
import model.StudentDB;

import java.time.LocalDate;

public class main {

    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student("Paul", 20002);
        Student student3 = new Student("Melina", 20005);


        student1.setName("Lea");
        student1.setId(12000);
        student1.setBirthday(LocalDate.of(1999, 11, 18));

        System.out.println(student1.getBirthday());
        System.out.println(student1.getId());
        System.out.println(student1.getName());
        System.out.println(student1.toString());
        System.out.println(student2.toString());

        StudentDB studentDB = new StudentDB( new Student[] {
                new Student("Maria", 2000),
                new Student("Paul", 20001),
                new Student("Hanna", 20002),
        });

        System.out.println(studentDB.toString());
        System.out.println(studentDB.randomStudent());
        studentDB.add(student3);
        System.out.println(studentDB.toString());

    }
}
