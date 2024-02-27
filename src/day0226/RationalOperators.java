package day0226;

public class RationalOperators {
    public static int[] plus(int[] left, int[] right) {
        int numerator = left[0] + right[0];
        int denominator = left[1] + right[1];
        
        int g = gCD(numerator, denominator);

        numerator = numerator / g;
        denominator = denominator / g;

        return new int[] {numerator, denominator};
    }

    public static int[] times(int[] left, int[] right) {
        int numerator = left[0] * right[0];
        int denominator = left[1] * right[1];
        
        int g = gCD(numerator, denominator);

        numerator = numerator / g;
        denominator = denominator / g;

        return new int[] {numerator, denominator};
    }

    public static int[] divides(int[] left, int[] right) {
        int numerator = left[0] / right[0];
        int denominator = left[1] / right[1];
        
        int g = gCD(numerator, denominator);

        numerator = numerator / g;
        denominator = denominator / g;

        return new int[] {numerator, denominator};
    }

    // 최소공배수
    private static int gCD(int m, int n) {
        return (n==0) ? m : gCD(n, m%n);
    }
}

class Test {
    public static void main(String[] args) {
        int[] i = {2, 4};
        int[] j = {2, 4};

        System.out.println(RationalOperators.plus(j, i));
    }
}