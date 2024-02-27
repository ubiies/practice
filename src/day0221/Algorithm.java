package day0221;

public class Algorithm {
    static int addFrom1To10 = 55;
    static int addFrom1To10() {
        int sum = 0;
        for(int i=0;i<=10;i++) {
            sum += i;
        }
        return sum;
    }
    static int sigma(int start, int end, int step) {
        int result = 0;
        for(int next=start;next<=end;next+=step) {
            result += next;
        }
        return result;
    }
    static int pi(int start, int end, int step) {
        int result = 1;
        for(int next=start;next<=end;next=next*step) {
            result = result * next;
        }
        return result;
    }
    // static int accumulate(Adder binder, int init, int start, int end, int step) {
    //     return 0;
    // }
    public static void main(String[] args) {
        System.out.println(addFrom1To10());
        System.out.println(addFrom1To10);
        System.out.println(sigma(1,10,1));
        System.out.println(pi(1,10,1));
    }
}