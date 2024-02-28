package day0228.Quiz;

public class Test {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        System.out.println(list1.get(0));
        System.out.println(list1.get(1));
        System.out.println(list1.get(2));

        List<String> list2 = new LinkedList<String>();
        list2.add("Hello");
        list2.add("world");

        System.out.println(list2.get(0));
        System.out.println(list2.get(1));
    }
}
