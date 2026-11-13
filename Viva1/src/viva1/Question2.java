package viva1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author zhenming
 */
import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean monDeposite = false;
        double D;
        do {
            System.out.print("Enter monthly deposit (RM): ");
            D = sc.nextDouble();
            if (D < 100 || D > 5000) {
                System.out.println("Error: Deposit must be betwwen RM100 and RM5000");
                monDeposite = true;
            } else {
                monDeposite = false;
            }
        } while (monDeposite);

        System.out.print("Enter starting annual interest rate (%): ");
        double R = sc.nextDouble();
        System.out.print("Enter saving goal (RM): ");
        int G = sc.nextInt();
        int M = 0;
        double W = 0.00;
        System.out.print("Is there a withdrawal? (Y/N): ");
        char WD_status = sc.next().charAt(0);
        if (WD_status == 'Y') {
            System.out.print("Enter withdrawal month (1-36): ");
            M = sc.nextInt();
            System.out.print("Enter withdrawal amount (RM): ");
            W = sc.nextDouble();
        }

        int year = 0;
        double balance = 0, interest = 0, totalInterest = 0, totalDeposit = 0, penalty = 0, R_month = 0, currentRate = 0;
        boolean goal = true;
        for (int i = 1; i <= 36; i++) {
            totalDeposit += D;
            year = ((i - 1) / 12 + 1);
            switch (year) {
                case 1:
                    currentRate = R;
                    R_month = currentRate / (100 * 12);
                    break;
                case 2:
                    currentRate = R + 0.5;
                    R_month = currentRate / (100 * 12);
                    break;
                case 3:
                    currentRate = R + 1;
                    R_month = currentRate / (100 * 12);
                    break;
            }

            balance += D;

            if (i == M) {
                if (WD_status == 'Y') {
                    if (M <= 12) {
                        penalty = W * 2 / 100;
                    }
                    W = W + penalty;
                    if (W > balance) {
                        System.out.println("Warning: Withdrawal exceed balance! Balence reset to RM 0.00.");
                        balance = 0.00;
                    } else {
                        balance -= W;
                        if (penalty > 0) {
                            System.out.printf("Early withdrawal penalty charged: RM%.2f%n", penalty);
                        }
                    }
                }
            }
            
            
            interest = balance * R_month;
            totalInterest += interest;
            balance += interest;
            
            
            if (goal) {
                if (balance >= G) {
                    System.out.println("Saving goal reached in Month " + i + "!");
                    goal = false;
                }
            }

            
            if (i == 12) {
                System.out.printf("End of Year 1 Balance: RM %.2f (rate %.1f", balance, currentRate);
                System.out.println("%)");
            }
            if (i == 24) {
                System.out.printf("End of Year 2 Balance: RM %.2f (rate %.1f", balance, currentRate);
                System.out.println("%)");
            }
            if (i == 36) {
                System.out.printf("End of Year 3 Balance: RM %.2f (rate %.1f", balance, currentRate);
                System.out.println("%)");
            }
        }
        System.out.printf("Total Deposits: RM %.2f%n", totalDeposit);
        System.out.printf("Total Interest Earned: RM%.2f%n", totalInterest);
    }
}
