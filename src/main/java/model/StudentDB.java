package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentDB {

    private Map<Integer, Student> students;

    public StudentDB() {
    }

    public StudentDB(List<Student> students) {
        this.students = new HashMap<>();
        for (Student student : students) {
            this.students.put(student.getId(), student);
        }
    }


    public List<Student> getAllStudents() {
        List<Student> list = new ArrayList<>();
        for (Map.Entry<Integer, Student> entry : students.entrySet()
             ) {
            list.add(entry.getValue());
        }
        return list;
    }

    public Student randomStudent() {
        int i = (int) (Math.random() * students.size());
        return students.get(i);
    }

    public void add(Student newStudent) {
        students.put(newStudent.getId(), newStudent);
    }


    public void remove(int id) {
        students.remove(id);
    }

    public Student findById (int id) {
        return students.get(id);
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + students +
                '}';
    }
}
