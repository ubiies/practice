package day0221;

public class returnEx {
    static void myMethod(int num) {
        System.out.println("Hello");
        if(num < 10)
        return;
        System.out.println("World!");
    }
    public static void main(String[] args) {
        myMethod(3);
        myMethod(12);
    }
}
