package gb2.less1.obstacles;

import gb2.less1.participants.Participant;

public class Track implements Obstacle{

    private final int trackDistance;

    public Track(int trackDistance) {
        this.trackDistance = trackDistance;
    }

    @Override
    public boolean passIt(Participant p) {
        if (p.run() >= this.trackDistance) {
            System.out.println(p.name() + " успешно прошел препятствие, равное " + trackDistance + " метров");
            return true;
        } else {
            System.out.println(p.name() + " не смог пройти препятствие, равное " + trackDistance + "  метров");
            return false;
        }
    }
}
