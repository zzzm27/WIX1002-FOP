/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

/**
 *
 * @author zhenming
 */
import java.util.Scanner;
public class Question3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Sale Volume: ");
        double commissionRate = 1;
        int volume = sc.nextInt();
        if (volume <= 100) {
            commissionRate = 0.05;
        }
        else if (volume <= 500) {
            commissionRate = 0.075;
        }
        else if (volume <= 1000) {
            commissionRate = 0.1;
        }
        else if (volume > 1000) {
            commissionRate = 0.125;
        }
        double commission = (double) volume * commissionRate;
        System.out.printf("Commission = %.2f", commission);
    }
}
