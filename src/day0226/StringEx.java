package day0226;

public class StringEx {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = new String("abc");

        String[] strings = s1.split(",");

        for(String s: strings) {
            System.out.println(s);
        }

        System.out.println(s1==s2);
        // 값 비교
        System.out.println(s1.equals(s2));
        System.out.println(s1.compareTo(s2));
    }
}
