package day0228;

public class Stack<E> {
    public E[] elements;
    private int index = 0;

    public Stack(int size) {
        this.elements = (E[])new Object[size];
    }

    public void push(E i) {
        this.elements[this.index++] = i;
    }

    public Object pop() {
        return this.elements[--index];
    }
}

class Test {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>(10);
        stack.push(1); 
        stack.push(2);
        stack.push(3);

        Stack<String> stack2 = new Stack<String>(10);
        stack2.push("Hello");

        // type casting
        int i = (Integer)stack.pop(); 
        int j = (Integer)stack.pop();
    }
}
