package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student student2 = new Student("Paul", 20002);
    Student student3 = new Student("Paul", 20002);
    Student student5 = new Student("Elli", 20002);
    Student student4 = student2;

    @Test
    void testEquals_whenStudent2Equals3_shouldTrue() {
        Assertions.assertTrue(student2.equals(student3));
    }

    @Test
    void testEquals_whenStudent2Equals4_shouldTrue() {
        Assertions.assertTrue(student2.equals(student3));
    }

    @Test
    void testEquals_whenStudent2Equals5_shouldFalse() {
        Assertions.assertFalse(student2.equals(student5));
    }

}