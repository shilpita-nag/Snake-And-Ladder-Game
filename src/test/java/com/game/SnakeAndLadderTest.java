package test.java.com.game;

import main.java.com.game.SnakeAndLadder;
import org.junit.Assert;
import org.junit.Test;

public class SnakeAndLadderTest {

    SnakeAndLadder snakeAndLadder = new SnakeAndLadder();

    @Test
    public void testPlayerReachedSnakePosition() {
        int currentPosition = 10;
        int diceVal = 4;
        int position = snakeAndLadder.movePlayerPosition(currentPosition,diceVal);
        Assert.assertEquals(position,7);
    }

    @Test
    public void testPlayerReachedGreenSnakePosition() {
        int currentPosition = 10;
        int diceVal = 2;
        int position = snakeAndLadder.movePlayerPosition(currentPosition,diceVal);
        Assert.assertEquals(position,10);
        position = snakeAndLadder.movePlayerPosition(currentPosition,diceVal);
        Assert.assertEquals(position,12);
    }

    @Test
    public void testPlayerReachedLadderPosition() {
        int currentPosition = 5;
        int diceVal = 4;
        int position = snakeAndLadder.movePlayerPosition(currentPosition,diceVal);
        Assert.assertEquals(position,31);
    }

    @Test
    public void testPlayerReachedEndPositon() {
        int currentPosition = 98;
        int diceVal = 2;
        int position = snakeAndLadder.movePlayerPosition(currentPosition,diceVal);
        Assert.assertEquals(position,100);
    }

    @Test
    public void testPlayerReachesPositionBeyondEndPoint() {
        int currentPosition = 98;
        int diceVal = 4;
        int position = snakeAndLadder.movePlayerPosition(currentPosition,diceVal);
        Assert.assertEquals(position,currentPosition);
    }

    @Test
    public void testDiceRoll() {
        int diceVal = snakeAndLadder.rollDice();
        Assert.assertTrue(diceVal >= 1 && diceVal <= 6);
    }

    @Test
    public void testCrookedDiceRoll() {
        int diceVal = snakeAndLadder.rollCrookedDice();
        Assert.assertTrue(diceVal >=1 && diceVal <= 6 && diceVal%2 == 0);
    }
 }