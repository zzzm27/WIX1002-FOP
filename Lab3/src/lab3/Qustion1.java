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
public class Qustion1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two interges: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.print("Enter the operator: ");
        char operator = sc.next().charAt(0);
        double result = 0;
        if (operator == '+') {
            result = num1+num2;
        }
        else if (operator == '-') {
            result = num1-num2;
        }
        else if (operator == '*') {
            result = num1*num2;
        }
        else if (operator == '/') {
            result = (double)num1/num2;
        }
        else if (operator == '%') {
            result = num1%num2;
        }
        else
            System.out.println("Invalid operator");
        System.out.println("Result: "+ result);
        }
                
    }
