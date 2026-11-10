/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zhenming
 */
import java.util.Random;
public class Question6 {
    public static void main(String[] args){
        Random rand = new Random();
        int testValue;
        while (true) {
            testValue = rand.nextInt();
            if (testValue >= 0) {
                break;
            }
        }
        System.out.println("test value is "+ testValue);
        int digit = 1;
        double transferValue = testValue;
        while (transferValue >= 10) {
            transferValue = (double) transferValue / 10;
            digit++;
        }
        System.out.println("Digit of test value is "+ digit);
    }
}
