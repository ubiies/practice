package day0220;

/**
 * 암시적 타입 변환에 대한 클래스
 * 이 변환은 반드시 성공하며 정보가 손실되지 않음
 */
public class ImplicitCasting {
    public static void main(String[] args) {
        /*
         * 정수의 암시적 타입 변환
         */
        int intValue = 123;
        long longValue = intValue;
        System.out.println((long)intValue+"="+longValue);
        
        /*
         * 실수의 암시적 타입 변환
         */
        float floatValue = 1.12F; // 부동 소수점 float
        double doubleValue = floatValue;
        System.out.println(floatValue);
        System.out.println(doubleValue);

        /*
         * 실수/정수 사이의 암시적 형 변환
         */
        doubleValue = longValue;
        System.out.println(doubleValue);
    }
}
