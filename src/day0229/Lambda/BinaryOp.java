package day0229.Lambda;

/*
 * Functional Interface 
 * : 단 하나의 abstract method를 가지고 있는 인터페이스
 * 익명 클래스를 만들 수 있음
 */
@FunctionalInterface
public interface BinaryOp {
    int apply (int x, int y);
}


class Algo {
    public static int calc(BinaryOp binder, int i, int j) {
        return binder.apply(i,j);
    }
}

class Adder implements BinaryOp {
    @Override
    public int apply(int x, int y) {
        return x+y;
    }
}

class Multi implements BinaryOp {
    @Override
    public int apply(int x, int y) {
        return x*y;
    }

}

class Test {
    public static void main(String[] args) {
        Algo.calc(new Adder(),1,2);
        Algo.calc(new Multi(), 1, 2);
        Algo.calc((x,y)->x*y,1,2); // Lambda
        System.out.println(Algo.calc((x,y)->x+y, 2, 5));
        BinaryOp adder = (x,y) -> x+y;
        System.out.println(Algo.calc(adder, 2, 5));
    }
}
