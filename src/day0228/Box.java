package day0228;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    T item;
    public Box(T i) {
        this.item = i;
    }

    public T getItem() {
        return this.item;
    }

    // 직접 사용 불가
    // public <T extends Number> T add(T i, T j) {
    //     T result = i+j;
    //     return result;
    // }
}

class Utilities {
    public <T> List<T> arrayToList(T[] array) {
        List<T> list = new ArrayList<T>();
        for(T t : array) {
            list.add(t);
        }
        return list;
    }
}

class Test {
    public static void main(String[] args) {
        Box<String> box1 = new Box<String>("abc");
        Box<Integer> box2 = new Box<Integer>(20);

        Integer[] arr = {1,2,3,4,5};
        Utilities utilities = new Utilities();
        List<Integer> list = utilities.arrayToList(arr); 
        
    }
}