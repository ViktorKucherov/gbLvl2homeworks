package gb2.less1.participants;

public class Robo implements Participant{

    private final String name;
    private double jumpH;
    private int distanceL;

    public String getName() {
        return name;
    }

    public void setJumpH(double jumpH) {
        this.jumpH = jumpH;
    }

    public void setDistanceL(int distanceL) {
        this.distanceL = distanceL;
    }

    public double getJumpH() {
        return jumpH;
    }

    public int getDistanceL() {
        return distanceL;
    }

    public Robo(String n, double j, int d) {
        this.name = n;
        this.jumpH = j;
        this.distanceL = d;
    }
    @Override
    public double jump() {
        System.out.println("Робот " + this.name + " прыгает на " + this.jumpH + " метров.");
        return jumpH;
    }

    @Override
    public int run() {
        System.out.println("Робот " + this.name + " пробегает дистанцию в " + this.jumpH + " метров.");
        return distanceL;
    }

    @Override
    public String name() {
        return "Робот " + name;
    }
}
