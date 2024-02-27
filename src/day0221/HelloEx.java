package day0221;

public class HelloEx {
    static int max(int i, int j) {
        return (i>j) ? i : j;
    }
    static int max(int x, int y, int z) {
        int[] arr = {x,y,z};
        int max = arr[0];
        for(int i=0;i<3;i++) {
            if(arr[i]>max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int max2(int x, int y, int z) {
        return max(max(x,y),z);
    }

    public static void main(String[] args) {
        System.out.println(max(1,2));
        System.out.println(max(1,2,3));
        System.out.println(max(1,2,3));
    }
}
