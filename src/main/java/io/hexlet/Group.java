package main.java.io.hexlet;

import java.util.Iterator;
import java.util.NoSuchElementException;
public class Group implements Iterable<Object> {

    private final Student[] students;

    public Group(final Student[] students) {
        this.students = students;
    }

    public final Iterator<Object> iterator() {
        return new StudentsIterator(students);
    }

    private static class StudentsIterator implements Iterator<Object> {
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
          if (!this.hasNext()) {
            throw new NoSuchElementException();
          }
          return students[index++];
        }
        // END
    }
}
