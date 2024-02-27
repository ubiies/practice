package day0221;

/**
 * 파라미터를 전달하는 기본 메커니즘
 * 파라미터의 인자의 값이 복사됨
 * 메소드 내부에서 변수 값은 변경 가능
 * 메소드 내부에서 변경된 변수 값은 메소드 외부로 영향을 주지 않음
 */
public class PassByValue {
    static void addOne(int i) {
        i++;
    }
    public static void main(String[] args) {
        int j = 5;
        addOne(j);
        System.out.println(j);
    }
}
