package day0228.listEx;

public interface List extends Iterable {
    public void print();
    public void add(int value);
    public int remove(int index);
    public int get(int index);
    int size();
}
