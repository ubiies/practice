package day0228.Quiz;

public class ArrayList<T> implements List<T> {
    private T[] elements;
    private int index = 0;

    public ArrayList() {
        this.elements = (T[])new Object[50];
    }

    public void add(T data) {
        try {
            this.elements[index++] = data;
        }
        catch (Exception e) {
            throw new ArrayListInvaliedAddException("Cannot add new data to ArrayList");
        }
    }

    public T remove(int index) {
        T returnValue = this.elements[index];

        for (int i = index; i < this.elements.length; i++) {
            this.elements[i] = this.elements[i - 1];
        }
        this.index--;

        return returnValue;
    }

    public T get(int index) {
        return this.elements[index];
    }
}
