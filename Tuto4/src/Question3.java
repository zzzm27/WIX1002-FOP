/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zhenming
 */
public class Question3 {
    public static void main(String[] args){
        int f1 = 1;
        System.out.println(f1);
        int f2 = 1;
        System.out.println(f2);
        int f3, temp;
        for (int i = 3; i <= 10; i++) {
            f3 = f1+f2;
            System.out.println(f3);
            temp = f2;
            f2 = f3;
            f1 = temp;
        }
    
    }
}
