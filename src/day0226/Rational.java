package day0226;

public class Rational {
    int numerator;
    int denominator;

    // constructor
    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;

        int g = this.gCD(numerator, denominator);

        this.numerator = this.numerator / g;
        this.denominator = this.denominator / g;
    }

    private int gCD(int m, int n) {
        return (n==0) ? m : gCD(n, m%n);
    }
}

class Test {
    public static void main(String[] args) {
        Rational i = new Rational(2, 4);
    }
}

/**
 * 0226 과제
 * 분수 더하기, 빼기 구하기 RationalOperators 구현
 * 객체를 쓰지 않고 메서드 형식으로 또는 main 메서드에 찍어내는 방식은
 * 재사용성이 떨어짐 체험해보셈
 * 객체 추상화.. 분수에 ㅡ무엇이 있어야 하는지?
 * 분자, 분모가 있어야하며... 캡슐화가 되어야 함
 * 분수를 정수로 바꾸는..? 화면에 보여줄 수 있는
 * toString() Override
 * 프랙탈에 뭐가 필요함? 생성할 때 반드시 integer 2개 받으셈
 * 내부적으로 생성될 때 약분해서..? 최소공약수
 * 더하기, 빼기 + 유리수랑 정수도 할 수 있는 
 * 메서드를 우루루 만들지 말고 객체를 만들어서 해보삼~~~~!
 * 더하기, 곱하기는 반드시 구현...!!
 * 추상화를 해서 분수 클래스 만들어서 객체끼리 연산 가능하게 해보셈
 * 오늘의 숙제는 수요일 아침까지 
 */