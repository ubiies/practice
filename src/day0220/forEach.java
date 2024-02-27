package day0220;

public class forEach {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int i = 0;

        while(i<array.length) {
            System.out.println(array[i]+" ");
            i++;
        }
        System.out.println();
        for(i=0;i<array.length;i++){
            System.out.println(array[i]+" ");
        }
        System.out.println();
        /*
         * array의 원소를 직접 꺼내지 않음
         */
        for(int j:array){
            System.out.println(j+" ");
        }
    }
}
