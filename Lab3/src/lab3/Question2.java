/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

/**
 *
 * @author zhenming
 */
import java.util.Random;
public class Question2 {
    public static void main(String[] args){
        Random rand = new Random();
        int num = rand.nextInt(6);
        switch (num){
            case 0:
                System.out.println(num +" is zero");
                break;
            case 1:
                System.out.println(num +" is one");
                break;
            case 2:
                System.out.println(num +" is two");
                break;
            case 3:
                System.out.println(num +" is three");
                break;
            case 4:
                System.out.println(num +" is four");
                break;
            case 5:
                System.out.println(num +" is five");
                break;
           }
        
    }
}
