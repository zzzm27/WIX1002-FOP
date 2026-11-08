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
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String:");
        String test = input.nextLine();
        for (int i = test.length() ; i > 0; i--) {
            System.out.print(" "+ test.charAt(i-1));
            
        }
    }
    
}
