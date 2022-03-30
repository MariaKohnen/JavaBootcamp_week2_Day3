package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

    Student student1 = new Student("Anna", 20000);
    Student student2 = new Student("Paul", 20002);
    Student student3 = new Student("Melina", 20005);

    @Test
    void removeWithId() {

        // Startlist
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        // New list with removed Student3
        ArrayList<Student> expected = new ArrayList<>();
        expected.add(student1);
        expected.add(student2);

        StudentDB testDB = new StudentDB(studentList);
        StudentDB expectedList = new StudentDB(expected);
        testDB.removeWithId(20005);
        //assertEquals(expected, testDB.getAllStudents())

        Assertions.assertEquals(expected, testDB.getAllStudents());

    }
}