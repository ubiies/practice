package day0219;
import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        System.out.println("Enter your name");
        Scanner sc = new Scanner(System.in);
        String myName = sc.nextLine();
        System.out.println("Greetings, "+myName);
        System.out.printf("Greetings, %s", myName);
        sc.close();
    }
}