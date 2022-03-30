package model;

import java.util.ArrayList;
import java.util.List;

public class StudentDB {

    private List<Student> students = new ArrayList<>();

    public StudentDB() {
    }

    public StudentDB(ArrayList<Student> insertedStudents) {
        this.students = insertedStudents;
    }


    public List<Student> getAllStudents() {
        return students;
    }

    public Student randomStudent() {
        int i = (int) (Math.random() * students.size());
        return students.get(i);
    }

    public void add(Student newStudent) {
        students.add(newStudent);
    }

    public void remove(Student student) {
        students.remove(student);
    }

    public void remove(int index) {
        students.remove(index);
    }

    public void removeWithId(int id) {
        for (Student student : this.students) {
            if (student.getId() == id) {
                students.remove(student);
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + students +
                '}';
    }

}
