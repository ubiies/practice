package day0221;

public class Scope {
    static int onePlusTwo() {
        int a, b;
        a = 1;
        b = 2;
        return a+b;
    }
    public static void main(String[] args) {
        int i = 0;
        i = onePlusTwo();
        System.out.println(i);
    }
}
