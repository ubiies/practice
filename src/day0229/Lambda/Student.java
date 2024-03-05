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

        Student ss = new Student(2, "eunbi");
        ss.printName(System.out::println);
    }
}

/*
 * 함수를 타입화 -> Functional Interface
 * 전통적인 방법 : 인터페이스를 추상화 받는 클래스를 만들어 사용 -> 권장 x
 * 익명 클래스 :
 * 람다식 : 
 */


 /*
  * 각각의 동작을 람다로 구현 가능
  */

  /*
   * protos종족을 리스트를 만들어서 방어력 별로 sorting이 가능해짐
   * 각각의 동작을 람다로 구현 가능
   * list iterable이면 foreach문을 이용해서 쫙 돌릴 수 있음
   * 모든 객체 지향 지식을 동원해서... 게임 만들기
   * 게임을 만든 다음 제출하고, 문제 2번을 추가
   * 그런데 2-3줄만 수정하고 추가가 가능하도록 잘 짜야 함
   * 클래스 하위를 고치지 않는 선에서 수정할 수 있도록 하는 것이 좋음
   * 2가지 버전을 제출 (1번, 1번에 2번 추가) 숙제
   * 
   */