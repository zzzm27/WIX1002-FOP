/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zhenming
 */
import java.util.Random;
public class Question8 {
    public static void main(String[] args){
        Random rand = new Random();
        int n = rand.nextInt(100);
        int c = 1;
        int i = 2;
        System.out.println("n is "+n);
        while (c <= n) {
            if ((i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) || (i==2 || i==3 || i==5 || i==7)) {
                System.out.println(c +" term :" +i+ " is prime number");
                c++;
            }
            i++;
        }
    }
}
