package main.java.com.game;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class SnakeAndLadder {
    final static int START = 0;
    final static int END = 100;

    static Map<Integer,Integer> snakes = new HashMap<>();
    static Map<Integer,Integer> ladders = new HashMap<>();
    static Map<Integer,GreenSnake> greenSnakes = new HashMap<>();

    public SnakeAndLadder() {
        snakes.put(14,7);
        snakes.put(54,34);
        snakes.put(62,18);
        snakes.put(64,60);
        snakes.put(87,45);
        snakes.put(93,73);
        snakes.put(98,79);

        ladders.put(2,38);
        ladders.put(4,14);
        ladders.put(9,31);
        ladders.put(21,42);
        ladders.put(28,84);
        ladders.put(51,67);
        ladders.put(72,91);
        ladders.put(80,99);

        GreenSnake gs1 = new GreenSnake(10,false);
        greenSnakes.put(12,gs1);
        GreenSnake gs2 = new GreenSnake(23,false);
        greenSnakes.put(33,gs1);
    }

    public int rollDice() {
        Random random = new Random();
        return random.ints(1, 7)
                .findFirst()
                .getAsInt();
    }

    public int rollCrookedDice() {
        Random random = new Random();
        int num = random.ints(1,4)
                .findFirst()
                .getAsInt();
        return num * 2;
    }

    public int movePlayerPosition(int currentPosition, int diceVal) {
        int position = currentPosition + diceVal;
        if(position > 100) {
            return currentPosition;
        }

        if(snakes.containsKey(position)) {
            System.out.println("Player got bit by a Snake. Go back to position " + snakes.get(position) + ".");
            return snakes.get(position);
        }
        else if(ladders.containsKey(position)) {
            System.out.println("Player climbs a Ladder. Go to position " + ladders.get(position) + "!");
            return ladders.get(position);
        }
        else if(greenSnakes.containsKey(position) && greenSnakes.get(position).isVisited() == false) {
                greenSnakes.get(position).setIsVisited(position);
                return greenSnakes.get(position).getFinalPosition();
        }
        else {
            return position;
        }
    }

    public void startGame(int diceType) {
        int currentPosition = 0;
        int totalTurns = 10;

        for(int turn = 1;turn <= totalTurns;turn++) {
            int diceVal = (diceType == 1) ? rollDice() : rollCrookedDice();
            currentPosition = movePlayerPosition(currentPosition,diceVal);
            if(currentPosition == 100) {
                System.out.println("Player wins the game!");
                break;
            }
            else {
                System.out.println("Player at position " + currentPosition + " after " + turn + " dice roll!");
            }
        }
    }
}
