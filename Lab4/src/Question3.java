/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zhenming
 */
import java.util.Scanner;
public class Question3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter score :");
        int score = sc.nextInt();
        int max = score;
        int min = score;
        int sum = 0;
        double sumSquare = 0;
        int count = 1;
        while (score >= 0) {
            if (score > max) {
                max = score;
            }
            if (score < min) {
                min = score;
            }
            sum += score;
            sumSquare = Math.pow(score,2);
            score = sc.nextInt();
            count++;
        }
        double standard_deviation = Math.sqrt(((sumSquare-(Math.pow(sumSquare, 2)/count))/(count-1)));
        double average = (double)sum / count;
        System.out.println("Minimum score = " + min);
        System.out.println("Maximum score = " + max);
        System.out.println("Average = "+ average);
        System.out.println("Standard Deviation = "+ standard_deviation);
    }
}
