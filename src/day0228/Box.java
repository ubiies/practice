package day0228;

public class Box<T> {
    T item;
    public Box(T i) {
        this.item = i;
    }

    public T getItem() {
        return this.item;
    }
}

class Test {
    public static void main(String[] args) {
        Box<String> box1 = new Box<String>("abc");
        Box<Integer> box2 = new Box<Integer>(20);
    }
}
