package task2;

import java.util.Arrays;

public class DynamicParameterizedArray<T> {
    private static int initSize;
    private T[] array;

    public DynamicParameterizedArray() {
        initSize = 0;
        this.array = (T[]) new Object[initSize];
    }

    public DynamicParameterizedArray(int newSize) {
        initSize = newSize;
        this.array = (T[]) new Object[initSize];
    }

    public void add(T item) {
        T[] result = Arrays.copyOf(array, array.length + 1);
        result[result.length - 1] = item;
        array = result;
    }

    public T get(int index) {
        return array[index];
    }

    public int size() {
        return array.length;
    }

    public void remove(int index) {
        T[] result = (T[]) new Object[array.length - 1];
        System.arraycopy(array, 0, result, 0, index);
        System.arraycopy(array, index + 1, result, index, array.length - index - 1);
        array = result;
    }

    public String toString() {
        return "array: " + Arrays.toString(array);
    }
}
