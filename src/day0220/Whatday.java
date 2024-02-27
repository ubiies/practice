package day0220;

import java.util.Scanner;

public class Whatday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String days = sc.nextLine();
        int dayNum = Integer.parseInt(days);

        int monthNum = 0;

        if(dayNum < 31) {
            monthNum = 0;
        }
        if(dayNum >= 31) { // 1월
            monthNum++;
            dayNum -= 31;
        }
        if(dayNum >= 28) { // 2월
            monthNum++;
            dayNum -= 28;
        }
        if(dayNum>= 31){ // 3월
            monthNum++;
            dayNum -= 31;
        }
        if(dayNum>= 30){ // 4월
            monthNum++;
            dayNum -= 30;
        }
        if(dayNum>= 31){ // 5월
            monthNum++;
            dayNum -= 31;
        }
        if(dayNum>= 30){ // 6월
            monthNum++;
            dayNum -= 30;
        }
        if(dayNum>= 31){ // 7월
            monthNum++;
            dayNum -= 31;
        }
        if(dayNum>= 31){ // 8월
            monthNum++;
            dayNum -= 31;
        }
        if(dayNum>= 30){ // 9월
            monthNum++;
            dayNum -= 30;
        }
        if(dayNum>= 31){ // 10월
            monthNum++;
            dayNum -= 31;
        }
        if(dayNum>= 30){ // 11월
            monthNum++;
            dayNum -= 30;
        }
        if(dayNum>= 31){ // 12월
            monthNum++;
            dayNum -= 31;
        }

        String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String monthName = monthNames[monthNum];

        // switch (monthNum) {
        //     case 0:
        //         monthName = "January";
        //         break;
        //     case 1:
        //         monthName = "February";
        //         break;
        //     case 2:
        //         monthName = "March";
        //         break;
        //     case 3:
        //         monthName = "April";
        //         break;
        //     case 4:
        //         monthName = "May";
        //         break;
        //     case 5:
        //         monthName = "June";
        //         break;
        //     case 6:
        //         monthName = "July";
        //         break;
        //     case 7:
        //         monthName = "August";
        //         break;
        //     case 8:
        //         monthName = "September";
        //         break;
        //     case 9:
        //         monthName = "October";
        //         break;
        //     case 10:
        //         monthName = "November";
        //         break;
        //     case 11:
        //         monthName = "December";
        //         break;
        //     default:
        //         monthName = "Not yet";
        //         break;
        // }
        System.out.println(monthName+", "+dayNum);
        sc.close();
    }
}
