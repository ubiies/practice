package day0221;


/**
 * Pass by Value : 값을 복사해서 전달, 값을 수정해도 원본 데이터 영향 x
 * Pass by Reference : 실제 값이 있는 주소 전달, 값 수정 영향 ㅇ
 * 자바의 경우 모든 파라미터 전달에 Pass by Value를 사용
 */
public class Process {
    static void process(int value) {
        System.out.println("전달받은 파라미터 인자의 값 : "+value);
        value = 10;
        System.out.println("함수 내에서 변경한 파라미타 인자의 값 : "+value);
    }
    public static void main(String[] args) {
        int i = 5;
        System.out.println("선언한 변수의 초기 값 : "+i);
        process(i);
        System.out.println("process 함수 호출 후 변수의 값 : "+i);
        // process 함수에서 해당 값을 수정해도 해당 함수가 종료되고 나면 원본 값 유지
    }
}
