package Obstacle;

public class Water extends Obstacle {
    int length2;

    public Water(int length2) {
        this.length2 = length2;
    }

    public void doIt(Competitor competitor) {
        competitor.swim(this.length2);
    }
}

