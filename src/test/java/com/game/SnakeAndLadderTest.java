package test.java.com.game;

import main.java.com.game.SnakeAndLadder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SnakeAndLadderTest {

    SnakeAndLadder snakeAndLadder = new SnakeAndLadder();

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testPlayerReachedSnakePosition() {
        int currentPosition = 10;
        int diceVal = 4;
        int position = snakeAndLadder.movePlayerPosition(currentPosition,diceVal);
        Assert.assertEquals(position,7);
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
        Assert.assertTrue(diceVal >= 0 && diceVal <= 6);
    }
}