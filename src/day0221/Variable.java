package day0221;

/**
 * 지역변수 : 메소드가 시작할 때 생성, 메소드 내에서만 유효
 * 공유변수(전역변수) : 클래스 수준에서 선언된 변수는 공유될 수 있음
 * 범위 충돌 : 로컬 변수 이름과 클래스 이름이 같은 경우 컴파일러는 이를 경고하지 않음
 */
public class Variable {
    static int cnt = 0; // 공유변수(전역변수)
    static void method1() {
        int i = 1; // 지역변수
        ++cnt;
        System.out.println("메소드가 "+cnt+"번 호출되었습니다.");
    }
    public static void main(String[] args) {
        method1();
        method1();
    }
}
