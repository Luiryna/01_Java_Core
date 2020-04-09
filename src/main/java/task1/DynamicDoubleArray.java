package task1;

import java.util.Arrays;

public class DynamicDoubleArray {
    private static int initSize;
    private double[] array;

    public DynamicDoubleArray() {
        initSize = 0;
        this.array = new double[initSize];
    }

    public DynamicDoubleArray(int newSize) {
        initSize = newSize;
        this.array = new double[initSize];
    }

    public void add(double item) {
        double[] result = Arrays.copyOf(array, array.length + 1);
        result[result.length - 1] = item;
        array = result;
    }

    public double get(int index) {
        return array[index];
    }

    public int size() {
        return array.length;
    }

    public void remove(int index) {
        double[] result = new double[array.length - 1];
        System.arraycopy(array, 0, result, 0, index);
        System.arraycopy(array, index + 1, result, index, array.length - index - 1);
        array = result;
    }

    public String toString() {
        return "array: " + Arrays.toString(array);
    }

}
