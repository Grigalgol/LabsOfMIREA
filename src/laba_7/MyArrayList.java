package laba_7;


public class MyArrayList<T> {
    private final int SIZE = 16;
    private final int CUT_RATE = 4;
    private Object[] array = new Object[SIZE];
    private int count = 0;

    public void add(T item) {
        if (count == array.length - 1) resize(array.length * 2);
        array[count++] = item;
    }


    public T get(int index) {
        return (T) array[index];
    }

    public void delete(int index) {
        for (int i = index; i < count; i++) {
            array[i] = array[i+1];
        }
        array[count] = null;
        count--;
        if (array.length > SIZE && count < array.length / CUT_RATE) resize(array.length/2);
    }

    private void resize(int newLenght) {
        Object[] newArray = new Object[newLenght];
        System.arraycopy(array, 0, newArray, 0, count);
        array = newArray;
    }
}
