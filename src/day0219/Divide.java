package day0219;
import java.util.Scanner;

public class Divide {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first Integer:");
            String temp = sc.nextLine();
            int i = Integer.parseInt(temp);

            System.out.println("Enter second Integer:");
            temp = sc.nextLine();
            int j = Integer.parseInt(temp);

            sc.close();

            int k = i/j;
            System.out.println(i+"/"+j+"="+k);
        } catch(Exception e) {
            System.out.println("An Exception was thrown: "+e);
        }
    }    
}
