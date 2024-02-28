package day0228.listEx;

public class Test {
    public static void main(String[] args) {
        System.out.println("[ArrayList]");
        List list = new ArrayList();
        System.out.print("1. add 메서드 수행 : ");
        list.add(10);
        list.add(20);
        list.add(30);
        list.print();
        list.remove(0);
        System.out.print("2. remove 메서드 수행 : ");
        list.print();
        System.out.println("3. get 메서드 수행 : "+list.get(0)+"\n");
        System.out.println("[LinkedList]");
        List list2 = new LinkedList();
        System.out.print("1. add 메서드 수행 : ");
        list2.add(10);
        list2.add(20);
        list2.add(30);
        System.out.println(list2.toString());
        list2.remove(0);
        System.out.print("2. remove 메서드 수행 : ");
        System.out.println(list2);
        System.out.println("3. get 메서드 수행 : "+list2.get(0));
    }
}
