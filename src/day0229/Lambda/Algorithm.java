package day0229.Lambda;

public class Algorithm {
    public static int calc(BinaryOp binder , int x, int y) {
        return binder.apply(x, y);
    }
}

// 전통적인 방법
class Adder implements BinaryOp {
    @Override
    public int apply(int x, int y) {
        return x+y;
    }
}

class Test4 {
    public static void main(String[] args) {
        // 전통적인 방법
        // 인터페이스를 만들고 인터페이스를 상속받는 클래스를 만들어 사용하는 방법
        Adder adder = new Adder();
        Algorithm.calc(adder, 4, 5);

        // Anonymous Class 익명 클래스 생성
        // BinaryOp는 functional interface이기 때문에 만들 수 있음
        // 클래스를 정의하는 것처럼 똑같이 정의..
        BinaryOp b = new BinaryOp() {
            public int apply(int i, int j) {
                return i+j;
            }
        };

        Algorithm.calc(
            new BinaryOp() {
                public int apply(int i, int j) {
                    return i+j;
                }
            }, 1, 2);

        // apply를 타입화
        // 정식으로 쓴 버전
        BinaryOp bb = (int i, int j) -> {return i+j;}; 

        // 람다식
        // 파라미터 타입과 리턴 생략 가능
        BinaryOp bbb = (i, j) -> i + j;

        System.out.println(Algorithm.calc(b, 5, 2)+", "+Algorithm.calc(bb,4,5)+", "+Algorithm.calc(bbb, 6, 7));
    }
}