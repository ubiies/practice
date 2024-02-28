package day0228.listEx;

public class ArrayListIterator implements Iterator {
    private ArrayList list;
    private int index;
    public ArrayListIterator(ArrayList list) {
        this.list = list;
    }
    @Override
    public boolean hasNext() {
        if (this.list.size() > this.index) {
            return true;
        }
        return false;
    }
    @Override
    public int next() {
        return this.list.get(this.index++);
    }
    
}
