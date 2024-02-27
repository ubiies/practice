package day0219;
import java.util.Scanner;
/**
 * @author NHN academy
 * @version 1.0 2022-03-01
 */
public class Hello {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int i,j;
        
        try {
            Scanner sc = new Scanner(System.in);
            i = sc.nextInt();
            j = sc.nextInt();
            
            System.out.println(i/j);
            sc.close();
        } catch(Exception e) {
            /*
             * 예외가 발생했을 때 발생한 예외의 스택 트레이스를 출력하는 코드
             * 예외가 발생한 위치와 예외를 메소드들의 호출 경로를 나타냄
             */
            e.printStackTrace();
        }
    }
}
