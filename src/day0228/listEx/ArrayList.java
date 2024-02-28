package day0228.listEx;

public class ArrayList implements List {
    private int[] array;
    private int size;

    public ArrayList() {
        array = new int[50];
        size = 0;
    }

    @Override
    public void add(int value) {
        if(size>=50) {
            throw new IndexOutOfBoundsException("배열이 초과되었습니다.");
        }
        array[size++] = value;
    }

    @Override
    public int remove(int index) {  
        int removedValue = array[index];
        if(index >= 50 || index < 0) {
            throw new IndexOutOfBoundsException("배열을 삭제할 수 없습니다.");
        }
        if(size >= 50 || size < 0) {
            throw new IndexOutOfBoundsException("배열을 삭제할 수 없습니다.");
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[--size] = 0;
        return removedValue;
    }

    @Override
    public int get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("해당 index에 요소가 존재하지 않습니다.");
        }
        return array[index];
    }

    @Override
    public void print() {
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]);
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
