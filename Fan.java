public class Fan {

    public int slow = 1;
    public int medium = 2;
    public int fast = 3;
    private int speed = 1;
    private boolean on = true;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }




    public static void main(String[] args) {

        Fan quatNhat = new Fan();

        if (quatNhat.isOn()){
            System.out.println("Fan Turn On " + " Toc do " + quatNhat.getSpeed() + " Mau sac: " + quatNhat.getColor() + " Ban kinh "+ quatNhat.getRadius());
        } else {
            System.out.println("Fan Turn Off " + " Mau sac: " + quatNhat.getColor() + " Ban kinh "+ quatNhat.getRadius());

        }

    }

}
