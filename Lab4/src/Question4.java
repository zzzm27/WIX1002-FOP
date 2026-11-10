/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zhenming
 */
import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");  //input
        int year = sc.nextInt();
        System.out.print("Enter first day of the year: ");
        int FirstDayOfTheYear = sc.nextInt();

        MonthCalendar(year, 5, FirstDayOfTheYear);   //output
        System.out.println("\n---------------------------\n");
        MonthCalendar(year, 8, FirstDayOfTheYear);
    }

    public static int dayMonth(int year, int month) {   //determine the Day in Month
        int dayMonth = month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 ? 31 : 30;
        if (month == 2) {
            dayMonth = isLeapYear(year) ? 29 : 28;
        } else if (month <= 0 || month >= 13) {
            dayMonth = 0;
        }
        return dayMonth;
    }

    public static boolean isLeapYear(int year) {   //determine LeapYear status
        return ((year % 4 == 0 || year % 400 == 0) && year % 100 != 0);
    }
//    boolean LeapYear = year%4==0 || year%400==0 && year%100!=0;   //determine leap year

    public static int totalDayBeforeMonth(int year, int month) {   //determine total day before certain month
        int totalDay = 0;
        for (int i = 1; i < month; i++) {
            totalDay += dayMonth(year, i);
        }
        return totalDay;
    }

    public static int FirstDayOfTheMonth(int year, int month, int FirstDayOfTheYear) {   //determine number of empty
        int i = FirstDayOfTheYear;
        int count = FirstDayOfTheYear;
        while (count <= totalDayBeforeMonth(year, month)) {
            if (i == 7) {
                i = 0;
            }
            count++;
            i++;
        }
        return i;
    }

    public static void EmptyCalendar(int year, int month, int FirstDayOfTheYear) {
        for (int i = 0; i < FirstDayOfTheMonth(year, month, FirstDayOfTheYear); i++) {
            System.out.print("    ");
        }
    }

    public static void MonthCalendar(int year, int month, int FirstDayOfTheYear) {
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        EmptyCalendar(year, month, FirstDayOfTheYear);
        int day = 1;
        Whole:
        for (int raw = 0; raw < 10; raw++) {
            if (raw == 0) {
                for (int col1 = FirstDayOfTheMonth(year, month, FirstDayOfTheYear); col1 < 7; col1++) {
                    System.out.printf("%3d ", day);
                    day++;
                }
                System.out.println();
            } else {
                for (int col2 = 0; col2 <= 6; col2++) {
                    if (day == dayMonth(year, month)) {
                        break Whole;
                    }
                    System.out.printf("%3d ", day);
                    day++;
                }
                System.out.println();
            }
        }
        System.out.print("\n");
    }
}

/*int jan = 31, mar = 31, may = 31, july = 31, aug = 31, oct = 31, dec = 31;   //decleration
        int apr = 30, june = 30, sep = 30, nov = 30;
        int feb;
        
        
        
        if (year % 4 == 0) {       //determine totalDay
            feb = 29;
        }
        else{
            feb = 28;
        }
        int totalDayMay = jan + feb + mar + apr+ may;
        
        
        for (int i = 2; i <= totalDayMay; i++) {   //determine the first day of the certain month
            day++;
            if (day == 7) {
                day = 0;
            }
        }
        System.out.println("day"+ day);
        
        int countDay = 1;
        int col = day;
        Whole: for (int row = 0; row < 6; row++) {
            if (row == 0) {
                for (int empty = 0; empty < day; empty++) {
                    System.out.print(" " + " ");
                }
            }
            
            FirstRow: while (col < 7) {
                System.out.print(countDay + " ");
                countDay++;
                col++;
                if (col==7) {
                    System.out.println();
                }
            }
                
            SecondRow: for (int coll = 0; coll <= 6; coll++) {
                    System.out.print(countDay + " ");
                if (countDay >= 31) {
                    break Whole;
                }
                countDay++;
                }
            System.out.println();
            }
            
        }
    }  */
