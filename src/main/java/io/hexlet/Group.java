package main.java.io.hexlet;

import java.util.Iterator;

public class Group implements Iterable<Student> {

    private final Student[] students;

    public Group(final Student[] students) {
        this.students = students;
    }

    public final Iterator<Student> iterator() {
        return new StudentsIterator(students);
    }

    private static class StudentsIterator implements Iterator<Student> {
        // BEGIN (write your solution here)
        private int index = 0;
        private final Student[] students;

        private StudentsIterator(Student[] students) {
            this.students = students;
        }

        @Override
        public boolean hasNext() {
            return students.length > index;
        }

        @Override
        public Student next() {
            return students[index++];
        }
        // END
    }
}
