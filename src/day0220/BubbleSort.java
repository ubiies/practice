package day0220;

/**
 * Bubble Sort 오름차순
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {3,5,2,9,17};
        for(int i=1;i<array.length;i++) {
            for(int j=0;j<i;j++) {
                if(array[j]>array[j+1]){
                    swap(array, j, j+1);
                }
            }
        }
        for(int i=0;i<array.length;i++){
            System.out.printf("%d ", array[i]);
        }
    }
    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = j;
        a[j] = temp;
    }
}
