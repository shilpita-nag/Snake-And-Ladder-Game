package main.java.com.game;

import java.util.Scanner;

public class SnakeAndLadderPlay {
    public static void main(String[] args) {
        SnakeAndLadder snakeAndLadder = new SnakeAndLadder();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter what type of dice you want to play with: \n 1 for Normal Dice \n 2 for Crooked Dice");
        int diceType = s.nextInt();
        while(diceType != 1 && diceType != 2) {
            System.out.println("Enter a valid input");
            diceType = s.nextInt();
        }
        snakeAndLadder.startGame(diceType);
    }
}
