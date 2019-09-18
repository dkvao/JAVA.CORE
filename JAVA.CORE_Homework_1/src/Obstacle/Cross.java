package Obstacle;

public class Cross extends Obstacle {
    int length1;

    public Cross(int length1) {
        this.length1 = length1;
    }

    public void doIt(Competitor competitor) {
        competitor.run(this.length1);
    }
}
