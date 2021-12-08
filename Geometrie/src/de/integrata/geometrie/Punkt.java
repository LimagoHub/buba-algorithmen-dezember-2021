package de.integrata.geometrie;

public class Punkt {

    private static final double MAX = 10.0;
    private double x;
    private double y;

    public Punkt() {
        x = y = 0;
    }

    private void setX(double x) {
        if(x < -MAX)
            x = -MAX;
        if(x > MAX)
            x = MAX;

        this.x = x;
    }

    private void setY(double y) {
        if(y < -MAX)
            y = -MAX;
        if(y > MAX)
            y = MAX;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }



    public void rechts() {
        setX(getX() + 1);
    }
    public void links() {
        setX(getX() - 1);
    }
    public void hoch() {
        setY(getY() + 1);
    }
    public void runter() {
        setY(getY() - 1);
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder( getClass().getSimpleName() + "{");
        sb.append("x=").append(x);
        sb.append(", y=").append(y);
        sb.append('}');
        return sb.toString();
    }
}
