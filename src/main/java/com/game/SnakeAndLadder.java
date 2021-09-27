package main.java.com.game;

import java.util.HashMap;
import java.util.Map;

public class SnakeAndLadder {
    final static int START = 0;
    final static int END = 100;

    static Map<Integer,Integer> Snakes = new HashMap<>();
    static Map<Integer,Integer> Ladders = new HashMap<>();

    SnakeAndLadder() {
        Snakes.put(17,7);
        Snakes.put(54,34);
        Snakes.put(62,18);
        Snakes.put(64,60);
        Snakes.put(87,45);
        Snakes.put(93,73);
        Snakes.put(98,79);

        Ladders.put(2,38);
        Ladders.put(4,14);
        Ladders.put(9,31);
        Ladders.put(21,42);
        Ladders.put(28,84);
        Ladders.put(51,67);
        Ladders.put(72,91);
        Ladders.put(80,99);
    }
}
