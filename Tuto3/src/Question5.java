/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zhenming
 */
import java.util.Scanner;
public class Question5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter leap years: ");
        int LY = input.nextInt();
        if (LY%4 == 0 && LY%100 != 0 || LY%400 == 0) 
            System.out.println("This is leap year");
        else
            System.out.println("This is not leap year");
            
        
    }
    
    
}
