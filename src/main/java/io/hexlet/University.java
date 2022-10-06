package main.java.io.hexlet;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.junit.Test;

public class University implements Iterable<Student> {

    private final Student[] students;

    public University(final Student[] students) {
        this.students = students;
    }

    public final Iterator<Student> iterator() {
        return new StudentsIterator();
    }

    private class StudentsIterator implements Iterator<Student> {
        // BEGIN (write your solution here)
        private int index = 0;
        @Override
        public boolean hasNext() {
            return University.this.students.length > index;
        }

        @Override
        public Student next() {
          if (!this.hasNext()) {
            throw new NoSuchElementException();
          }
          return University.this.students[index++];
        }

        // END
    }
}

//public class University  implements  Iterable<Student>{
//    private final Student[] students;
//    public University(final Student[] realStudents) {
//        this.students = realStudents;
//    }
//
//    @Override
//    public Iterator<Student> iterator() {
//        return Arrays.asList(students).iterator();
//    }
//}
