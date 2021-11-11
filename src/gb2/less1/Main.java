package gb2.less1;

import gb2.less1.events.Competition;
import gb2.less1.obstacles.Obstacle;
import gb2.less1.obstacles.Track;
import gb2.less1.obstacles.Wall;
import gb2.less1.participants.Cat;
import gb2.less1.participants.Participant;
import gb2.less1.participants.Person;
import gb2.less1.participants.Robo;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Competition competition = new Competition("Веселые старты");

        Obstacle wall = new Wall(2.0);
        Obstacle track = new Track(10_000);

        Cat cat = new Cat("Вася", 1.2, 1000);
        Person person = new Person("Василий Петрович", 2.2, 10_000);
        Robo roboCop = new Robo("RoboCop", 0.3, 5000);

        competition.setParticipants(cat, person, roboCop);
        competition.setObstacles(wall, track);

        competition.startCompetition();
        System.out.println("Победители: ");
        for (Participant p: competition.getWinners())  {
            System.out.println(p.name());
        }
    }
}
