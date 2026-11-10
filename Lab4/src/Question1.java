/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zhenming
 */
import java.util.Scanner;
public class Question1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int in = sc.nextInt();
        
        System.out.print("The factor are: ");
        for (int i = 1; i <= in; i++) {
            if (in % i == 0){
                System.out.print(i + " ");
            }
            
        }
    }
    
}
