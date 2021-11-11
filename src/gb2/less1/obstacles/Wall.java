package gb2.less1.obstacles;

import gb2.less1.participants.Participant;

public class Wall implements Obstacle{

    private final double wallHeight;

    public Wall(double wallHeight) {
        this.wallHeight = wallHeight;
    }


    @Override
    public boolean passIt(Participant p) {
        if (p.jump() >= this.wallHeight) {
            System.out.println(p.name() + " успешно перепрыгнул препятствие, равное " + wallHeight + " метров");
            return true;
        } else {
            System.out.println(p.name() + " не смог перепрыгнуть препятствие, равное " + wallHeight + " метров");
            return false;
        }
    }
}
