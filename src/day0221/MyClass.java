package day0221;

public class MyClass {
    static void myMethod() {
        System.out.println("Hello World!");
    }
    public static void main(String[] args) {
        System.out.println("The Program is Starting");
        myMethod();
        OtherClass.methodInOtherClass();
        System.out.println("The Program is ending");

    }
}

class OtherClass {
    public static void methodInOtherClass() {
        System.out.println("This method is in OtherClass");
    }
}
