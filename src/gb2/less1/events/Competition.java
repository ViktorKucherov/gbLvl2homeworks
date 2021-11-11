package gb2.less1.events;

import gb2.less1.obstacles.Obstacle;
import gb2.less1.participants.Cat;
import gb2.less1.participants.Participant;

import java.util.ArrayList;
import java.util.List;

public class Competition {

    private final String competitionTitle;
    private Obstacle[] obstacles;
    private Participant[] participants;
    private List<Participant> winners = new ArrayList<>();

    public List<Participant> getWinners() {
        return winners;
    }

    public Competition(String name) {
        this.competitionTitle = name;
    }

    public void setObstacles(Obstacle... obstacles) {
        this.obstacles = obstacles;
    }

    public void setParticipants(Participant... participants) {
        this.participants = participants;
    }

    public void startCompetition() {
        System.out.println(competitionTitle + ". мероприятие начинается. ");
        winners.clear();

        for (Participant p : participants) {
            boolean crossed = passAllObstacles(p);
            if (!crossed) {
                System.out.println("Участник " + p.name() + " покидает соревнование");
            } else {
                winners.add(p);
            }
        }
    }

    public boolean passAllObstacles(Participant p) {
        for (Obstacle o : obstacles) {
            if (!p.passObstacle(o)) {
                return false;
            }

        }
        return true;
    }
}




