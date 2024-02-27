package day0221;

public class MethodCall {
    static void method1() {
        System.out.println("method 1");
    }
    static void method2() {
        method1();
        System.out.println("method 2");
    }
    public static void main(String[] args) {
        method1();
        method2();
    }
}