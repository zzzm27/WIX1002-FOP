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
public class Question4 {
    public static void main(String[] args){
      Random rand = new Random();
      int dice1 = rand.nextInt((6-1)+1)+1; //rand((max-min)+1)+min;
      int dice2 = rand.nextInt((6-1)+1)+1;
      int Player1 = dice1 + dice2;
      dice1 = rand.nextInt((6-1)+1)+1; //rand((max-min)+1)+min;
      dice2 = rand.nextInt((6-1)+1)+1;
      int Player2 = dice1 + dice2;
        System.out.println("Point of Player 1: "+ Player1);
        System.out.println("Point of Player 2: "+ Player2);
      
        if (Player1 > Player2) {
            System.out.println("P1 win");
        }
        else if (Player1 < Player2) {
            System.out.println("P2 win");
        }
        else
            System.out.println("draw");
    }
}
    
