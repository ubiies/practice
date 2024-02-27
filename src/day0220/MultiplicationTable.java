package day0220;

public class MultiplicationTable {
    public static void main(String[] args) {
        for(int i=2;i<=9;i++){
            for(int j=1;j<=9;j++) {
                System.out.println(i+"*"+j+"="+i*j);
            }
            System.out.println();
        }
    }
}

class MultiplicationTable2 {
    public static void main(String[] args) {
        int i = 2;
        int j = 2;
        while (i<10) {
            while (j<10) {
                System.out.println(i+"*"+j+"="+i*j);
                j++;
            }
            i++;
        }
    }
}
