package day0221;

public class Sample {
    public static int max(int... values) {
        int result = 0;
        for(int i=0;i<values.length-1;i++) {
            result = max(values[i], values[i+1]);
        }
        return result;
    }
    public static int max(int i, int j) {
        if(i>j) {
            return i;
        } else {
            return j;
        }
    }
    public static void main(String[] args) {
        System.out.println(max(1,2,3,4,5,6,7));
    }
}
