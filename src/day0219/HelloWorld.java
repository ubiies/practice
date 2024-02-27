package day0219;

public class HelloWorld {
    public static void main(String[] args) {
        int result = Sample.add(1, 2);
        System.out.println(result);
    }
}

class Sample2 {
    public static void main(String[] args) {
        System.out.println("From Sample2");
    }
}

class Sample3 {
    public static void main(String[] args) {
        int i = 5;
        int result;
        // result = (i>10) ? 5 : 10;

        if (i>10) {
            result = 5;
        } else {
            result = 5;
        }
        System.out.println(result);
    }
}