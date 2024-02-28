package day0227;

public interface BinaryOp {
    /*
     * 정수형 파라미터 2개를 연산한 결과를 정수형으로 반환한다.
     */
    // 추상 메서드의 경우 default보다 낮게 설정하면 안됨
    public int apply(int i, int j); // 구현은 서브 클래스에서
    default int apply(int i, int j, int k) {
        return apply(apply(i,j),k);
    }
}

class Adder implements BinaryOp {
    // 추상 메서드는 반드시 구현해야 됨
    @Override
    public int apply(int i, int j) {
        return i+j;
    }
}

class test {
    public static void main(String[] args) {
        BinaryOp b = new Adder();
        b.apply(1, 2);
        b.apply(1, 2, 3);
    }
}