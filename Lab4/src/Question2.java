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
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int temp = 0;
        int sum = 0;
        int total = 0;
        for (int i = 1; i <= n; i++) {
            sum = i + temp;
            temp = sum;
            total += sum;
            System.out.println(sum);
        }
        System.out.println("Total :"+ total);
    }
}
