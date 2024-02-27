package day0221;

import java.util.Scanner;

public class Utilities {
    public static int max(int i, int j) {
        if (i>j) {
            return i;
        } else {
            return j;
        }
    }
    public static void swap(int i, int j) {
        int temp = i;
        i = j;
        j = temp;
    }
    public static int max(int... values) {
        int result = values[0];
        for (int i : values) {
            result = max(i, result);
        }
        return result;
    }
    public static int findMax(int[] values, int start, int end) {
        if(start == end) {
            return values[start];
        } else {
            int mid = (start + end) / 2;
            int leftMax = findMax(values, start, mid);
            int rightMax = findMax(values, mid + 1, end);
            return Math.max(leftMax, rightMax);
        }
    }
    public static int max2(int... values) {
        return findMax(values, 0, values.length - 1);
    }
}
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력하세요.");
        int i = sc.nextInt();
        System.out.println("두번째 숫자를 입력하세요.");
        int j = sc.nextInt();
        sc.close();
        System.out.println(i+","+j+" 중 큰 숫자는"+Utilities.max(i,j)+" 입니다.");

        int x = 2, y = 3;
        System.out.println("swap 메소드 호출 전 i = "+x+", j = "+y);
        // 자바는 Pass by Value이기 때문에 값을 복사해옴
        // 따라서 바뀌지 않음
        Utilities.swap(x, y);
        System.out.println("swap 메소드 호출 후 i = "+x+", j = "+y);

        int result = Utilities.max(1,2,3,4,5,6,7);
        System.out.println(result);
        System.out.println(Utilities.max2(1,2,3,4,5));
    }
}
