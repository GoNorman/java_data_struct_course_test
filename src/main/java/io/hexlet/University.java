package main.java.io.hexlet;
import java.util.Iterator;
import java.util.Arrays;

public class University  implements  Iterable<Student>{
    private final Student[] students;
    public University(final Student[] realStudents) {
        this.students = realStudents;
    }

    @Override
    public Iterator<Student> iterator() {
        return Arrays.asList(students).iterator();
    }
}
