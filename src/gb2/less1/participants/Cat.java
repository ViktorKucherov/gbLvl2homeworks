package gb2.less1.participants;



public class Cat implements Participant{

    private final String name;
    private double jumpH;
    private int distanceL;

    public String getName() {
        return name;
    }

    public double getJumpH() {
        return jumpH;
    }

    public void setJumpH(double jumpH) {
        this.jumpH = jumpH;
    }

    public void setDistanceL(int distanceL) {
        this.distanceL = distanceL;
    }

    public int getDistanceL() {
        return distanceL;
    }
//TODO fef
    public Cat(String n, double j, int d) {
        this.name = n;
        this.jumpH = j;
        this.distanceL = d;
    }

    @Override
    public double jump() {
        System.out.println("Кот " + this.name + " прыгает на " + this.jumpH + " метров.");
        return jumpH;
    }

    @Override
    public int run() {
        System.out.println("Кот " + this.name + " пробегает дистанцию в " + this.jumpH + " метров.");
        return distanceL;
    }

    @Override
    public String name() {
        return "Кот " + name;
    }
}
