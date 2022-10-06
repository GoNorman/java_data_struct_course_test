package main.java.io.hexlet;
import main.java.io.hexlet.ArrayCollection;

import java.util.Collection;

import static org.junit.Assert.assertEquals;

public class App {
    public static void main(String[] args) {
      final Collection<Integer> testInstance = new ArrayCollection<>();
      testInstance.add(1);
      testInstance.remove(1);
      assertEquals(0, testInstance.size());
    }
}
