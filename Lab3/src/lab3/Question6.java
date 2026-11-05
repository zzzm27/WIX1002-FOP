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
public class Question6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        int radius = sc.nextInt();
        System.out.println("Enter coordinate x: ");
        double x = sc.nextInt();
        System.out.println("Enter coordinate y: ");
        double y = sc.nextInt();
        
        if (x > radius || y > radius) {
            System.out.println("The coordinate is outside the circle");
        }
        else
            System.out.println("The coordinate is inside the circle");
        
        
    }
}
