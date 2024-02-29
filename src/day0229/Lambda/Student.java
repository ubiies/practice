package day0229.Lambda;

public class Student {
    private int no;
    private String name;
    
    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return this.no;
    }

    public String getName() {
        return name;
    }

    public void printName(Function f) {
        f.print(name);
    }
}

class PrintToStandardOutput implements Function {
    @Override
    public void print(String name) {
        System.out.println(name);
    }
}

class Test3 {
    public static void main(String[] args) {
        Student s = new Student(1, "Celine");
        PrintToStandardOutput std = new PrintToStandardOutput();
        s.printName(std);

        // Anonymous class
        Function ff = new Function() {
            public void print(String name) {
                System.out.println(name);
            }
        };
        
        /*
         * Anonymous Method (익명 메서드)
         * 단 한번만 사용할 수 있고, 하나의 객체만을 생성할 수 있는 일회용 클래스
         */
        // s.printName(
        //     new Function() {
        //         public void print(String name) {
        //             System.out.println(name);
        //         }
        //     }
        // );

        // 익명 클래스를 람다식으로 줄여 사용이 가능함
        Function f = x -> System.out.println(x);
        s.printName(f);
    }
}

/*
 * 함수를 타입화 -> Functional Interface
 * 전통적인 방법 : 인터페이스를 추상화 받는 클래스를 만들어 사용 -> 권장 x
 * 익명 클래스 :
 * 람다식 : 
 */