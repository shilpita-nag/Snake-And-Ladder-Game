package main.java.com.game;

public class GreenSnake {

    private int finalPosition;
    private boolean visited;
    public GreenSnake(int finalPosition, boolean visited) {
        this.finalPosition = finalPosition;
        this.visited = visited;
    }

    public int getFinalPosition() {
        return finalPosition;
    }

    public void setIsVisited(int finalPosition) {
        this.visited = true;
    }

    public boolean isVisited() {
        return visited;
    }
}
