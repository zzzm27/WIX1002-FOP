/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zhenming
 */
import java.util.Scanner;
public class Question7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amount: ");   //input
        int P = sc.nextInt();
        System.out.print("Enter interest in %: ");
        double i = sc.nextInt();
        System.out.print("Enter total number of month: ");
        int N = sc.nextInt();
        printTable(i, P, N);
    }

    public static void printTable(double i, int P, int N) {
        String[] categories = {"Month", "Monthly Payment", "Principal", "Interest", "Unpaid Balance", "Total Interest"};
        for (int j = 0; j < categories.length; j++) {
            System.out.print(categories[j] + "  ");
        }
        System.out.println();
        double unpaid;
        double totalInterest = 0;
        for (int n = 1; n <= N; n++) {
                System.out.printf("%-4d  ", n);
                System.out.printf("%16.2f  ", MonthlyPayment(i, P, N));
                System.out.printf("%9.2f  ", Principal(i, P, N, n));
                System.out.printf("%8.2f  ", Interest(i, P, N, n));
                unpaid = P - Principal(i, P, N, n);
                System.out.printf("%14.2f  ", unpaid);
                totalInterest += Interest(i, P, N, n);
                System.out.printf("%14.2f  ", totalInterest);
            System.out.println();
        }

    }

    public static double MonthlyPayment(double i, int P, int N) {
        return ((P * (i / (12 * 100))) / (1 - Math.pow((1 + (i / (12 * 100))), -N)));
    }

    public static double Principal(double i, int P, int N, int n) {
        return (MonthlyPayment(i, P, N) * Math.pow((1 + (i / (12 * 100))), -(1 + N - n)));
    }

    public static double Interest(double i, int P, int N, int n) {
        return (MonthlyPayment(i, P, N) - Principal(i, P, N, n));
    }

}
