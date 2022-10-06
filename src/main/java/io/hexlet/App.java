package main.java.io.hexlet;
import main.java.io.hexlet.ArrayCollection;

import java.util.Collection;

public class App {
    public static void main(String[] args) {
      final Collection<Integer> testInstance = new ArrayCollection<>();
      testInstance.add(1);
      testInstance.add(2);
      System.out.println(testInstance.remove(1));
    }
}
