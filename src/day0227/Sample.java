package day0227;

public class Sample {
    public int doSomething() {
        AThread thread = new AThread();
        thread.start();
        return 0;
    }
}

class AThread extends java.lang.Thread { 
}

class Test6 {
    public static void main(String[] args) {
        //In use or reachable(사용중)
        Sample s = new Sample(); // new 연산자로 인해 메모리에 할당됨
        int i = s.doSomething(); 
        s = null; // null로 선언해도 객체가 메모리에서 내려가진 않음
        /*
         * 객체를 제거한다는 것은
         * 할당된 메모리를 제거해야함
         */
        for(;;){

        }
    }
}


/*
 * 자바의 단점 
 * 자바는 메모리 공간을 확보하고 실행이 됨
 * stack 메모리 초과 -> stack overflow
 * 자바 프로그램 환경은 메모리 확보가 되어야 함
 * 자바로 만드는 프로그램의 경우 메모리를 많이 씀
 */

/*
 * IaaS
 * PaaS
 * SaaS
 */