package day0228.listEx;

// 단방향으로 구현
public class LinkedList implements List {
    private Node head;
    private Node tail;
    private int size = 0;

    class Node {
        int data; // 데이터 저장 필드
        Node next; // 다음 노드
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
        public String toString() {
            return String.valueOf(this.data);
        }
    }

    LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    Node node(int index) {
        Node x = head;
        for(int i=0;i<index;i++) {
            x = x.next;
        }
        return x;
    }

    @Override
    public void add(int value) {
        Node newNode = new Node(value);
        if(size == 0){
            newNode.next = head;
            head = newNode;
            size++;
            if(head.next == null){
                tail = head;
            }
        } else {
            tail.next = newNode;
            tail = newNode;
            size++;  
        }      
    }

    @Override
    public int remove(int i) {
        if(i==0) {
            Node temp = head;
            head = temp.next;
            int returnData = temp.data;
            temp = null;
            size--;
            return returnData;
        } else {
            Node temp = node(i-1);
            Node deletedNode = temp.next;
            temp.next = temp.next.next;
            int returnData = deletedNode.data;
                if(deletedNode == tail) {
                tail = temp;
                }
            deletedNode = null;
            size--;
            return returnData;
        }
    }

    @Override
    public int get(int i) {
        Node temp = node(i);
        return temp.data;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void print() {
    }

    @Override
    public String toString() {
        if(head == null){
            return "[]";
        }       
        Node temp = head;
        String str = "[";
        while(temp.next != null){
            str += temp.data + ", ";
            temp = temp.next;
        }
        str += temp.data;
        return str+"]";
    }

    @Override
    public Iterator iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }
}
