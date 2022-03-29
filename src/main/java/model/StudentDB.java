package model;

import java.util.Arrays;

public class StudentDB {

    protected Student[] students;

    public StudentDB(Student[] insertedStudents) {
        this.students = insertedStudents;
    }

    public Student[] getAllStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "students=" + Arrays.toString(students) +
                '}';
    }

    public Student randomStudent() {
        int i = (int) (Math.random() * students.length);
        return students[i];
    }

    public void add(Student newStudent) {
        Student[] newStudents = Arrays.copyOf(students, students.length +1);
        newStudents[newStudents.length-1] = newStudent;
        this.students = newStudents;
     }

     public void remove(int id) {
         for (int i = 0; i < students.length; i++) {
             //Remove and create new array
             Student[] newStudents = Arrays.copyOf(students, students.length-1);
             System.arraycopy(students, 0, newStudents, 0, i);
             System.arraycopy(students, i+1, newStudents, i, students.length -(i+1));
             this.students = newStudents;
         }
     }
}
