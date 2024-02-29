package day0228.studentEx;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class StudentList<T> implements Iterator<T> {
    List<T> list = new ArrayList<T>();

    public void add(T item) {
        list.add(item);
    }

    public java.util.Iterator<T> iterator() {
        return list.iterator();
    }

    @Override
    public boolean hasNext() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hasNext'");
    }

    @Override
    public T next() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'next'");
    }
}

/*
 * 
 */