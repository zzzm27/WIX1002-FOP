/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zhenming
 */
import java.util.Random;

public class Question5 {

    public static void main(String[] args) {
        Random rand = new Random();
        int totalScoreP1 = 0, totalScoreP2 = 0;
        int scoreP1, scoreP2;
        Game:
        while (totalScoreP1 !=-1) {
            roundP1:
            while (totalScoreP1 !=-1 ) {
                scoreP1 = rand.nextInt(6 - 1 + 1) + 1;
                System.out.println("This round P1 score "+scoreP1);
                totalScoreP1 += scoreP1;
                if (scoreP1 == 6) {
                    continue;
                }
                if (totalScoreP1 >= 100) {
                    break Game;
                }
                break;
            }

            roundP2:
            while (totalScoreP2 !=-1 ) {
                scoreP2 = rand.nextInt(6 - 1 + 1) + 1;
                System.out.println("This round P2 score "+scoreP2);
                totalScoreP2 += scoreP2;
                if (scoreP2 == 6) {
                    continue;
                }
                if(totalScoreP2 >= 100){
                    break Game;
                }
                break ;
            }
        }
        System.out.println("Score of Player 1 = "+ totalScoreP1);
        System.out.println("Score of Player 2 = "+ totalScoreP2);
        if (totalScoreP1 >= 100 && totalScoreP2 < 100) {
            System.out.println("Player 1 is winner");
        }
        else if(totalScoreP2 >= 100 && totalScoreP1 < 100){
            System.out.println("Player 2 is winner");
        }
        else{
            System.out.println("This game is draw");
        }

    }
}
