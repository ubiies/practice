package day0220;

import java.util.Scanner;

public class Whatday2 {
    static int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static int[] daysInLeapMonth  = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Enter year number: ");
            String line = sc.nextLine();
            int yearNum = Integer.parseInt(line);

            boolean isLeapYear = (yearNum%4==0)&&(yearNum%100!=0||yearNum%400==0);

            if (isLeapYear) {
                System.out.println("it's Leap Year");
            } else {
                System.out.println("it's Common year");
            }

            System.out.println("Enter a digit 1 between 365 : ");
            line = sc.nextLine();
            int dayNum = Integer.parseInt(line);

            sc.close();

            if(dayNum<1 || dayNum>365) {
                throw new IllegalArgumentException("Out of date range");
            }

            int monthNum = 0;

            for(int days:daysInMonth) {
                if(dayNum<=days) {
                    break;
                } else {
                    dayNum -= days;
                    monthNum++;
                }
            }
            String monthName = monthNames[monthNum];

            System.out.printf("%s, %d", monthName, dayNum);
        } catch(IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
