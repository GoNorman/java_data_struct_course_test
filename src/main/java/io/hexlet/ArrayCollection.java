package main.java.io.hexlet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayCollection<T> implements Collection<T>{
  private T[] array = (T[]) new Object[1];
  private int size;

  @Override
  public final int size() {
    // BEGIN (write your solution here)
    return this.size;
    // END
  }

  @Override
  public final boolean isEmpty() {
    // BEGIN (write your solution here)
    return this.size == 0;
    // END
  }

  @Override
  public final boolean contains(final Object o) {
    // BEGIN (write your solution here)
    for (int i = 0; i <= size; i++) {
      if (array[i].equals(o)) return true;
    }
      return false;
    // END
  }

  @Override
  public final Iterator<T> iterator() {
    // BEGIN (write your solution here)
    return new ElementsIterator();
    // END
  }

  @Override
  public final Object[] toArray() {
    // BEGIN (write your solution here)
    final T[] newM = (T[])new Object[this.size];
    System.arraycopy(array, 0, newM, 0, this.size);
    return newM;
    // END
  }

  @Override
    /*This method may prove to be too difficult.
    he test is not covered.*/
  public final <T1> T1[] toArray(T1[] a) {
    // BEGIN (write your solution here)
    return (T1[])this.toArray();
    // END
  }

  @Override
  public final boolean add(final T t) {
    // BEGIN (write your solution here)
    if (array.length == size) {
      final T[] oldArray = array;
      array = (T[]) new Object[this.size() * 2];
      System.arraycopy(oldArray, 0, array, 0, oldArray.length);
    }
    array[size++] = t;
    return true;
    // END
  }

  @Override
  public final boolean remove(final Object o) {
    // BEGIN (write your solution here)
    for (int i = 0; i < size(); i++) {
      if (array[i].equals(o) && i != this.size() - 1) {
        System.arraycopy(array, i+1, array, i, this.size() - i);
        size--;
        return true;
      }
    }
    return false;
    // END
  }

  @Override
  public final boolean containsAll(final Collection<?> c) {
    // BEGIN (write your solution here)
    for (final Object item : c) {
      if (!this.contains(item)) return false;
    }
    return true;
    // END
  }

  @Override
  public final boolean addAll(final Collection<? extends T> c) {
    // BEGIN (write your solution here)
    for (final T item : c) {
      add(item);
    }
    return true;
    // END
  }

  @Override
  public final boolean removeAll(final Collection<?> c) {
    // BEGIN (write your solution here)
    for (final Object item : c) {
      remove(item);
    }
    return true;
    // END
  }

  @Override
  public final boolean retainAll(final Collection<?> c) {
    // BEGIN (write your solution here)
    for (final Object item : c) {
      if (!this.contains(item)) this.remove(item);
    }
    return true;
    // END
  }

  @Override
  public final void clear() {
    // BEGIN (write your solution here)
    array = (T[]) new Object[1];
    size = 0;
    // END
  }

  private class ElementsIterator implements Iterator<T> {
    // BEGIN (write your solution here)
    private int index = 0;
    @Override
    public boolean hasNext() {
      return ArrayCollection.this.array.length > index;
    }

    @Override
    public T next() {
      if (!this.hasNext()) {
        throw new NoSuchElementException();
      }
      return ArrayCollection.this.array[index++];
    }
    // END
  }
}
