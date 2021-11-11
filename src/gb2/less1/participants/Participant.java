package gb2.less1.participants;

import gb2.less1.obstacles.Obstacle;

public interface Participant {

    double jump();
    int run();
    String name();

    default boolean passObstacle(Obstacle obstacle) {
        return goThrough(obstacle);
    }

    private boolean goThrough(Obstacle obstacle) {
        return obstacle.passIt(this);
    }
}
