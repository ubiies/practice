package day0220;

/**
 * 명시적 타입 변환에 대한 클래스
 * 타입 변환식 (cast expression)을 사용해야 함
 * 데이터 손실이 발생할 수 있음
 */
public class ExplicitCasting {
    public static void main(String[] args) {
        /*
         * 아래의 예에서는 int보다 큰 수가 int로 변환되었기 때문에
         * overflow가 발생하여 이상한 값이 출력됨
         */
        long longValue = Long.MAX_VALUE;
        int intValue = (int)longValue;
        System.out.println((long)longValue+"="+intValue);

    }
}
