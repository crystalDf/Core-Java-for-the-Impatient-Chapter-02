package ch02.ex;

public class Ex06 {

    public static void main(String[] args) {

        Point2 p = new Point2(3, 4).translate(1,3 ).scale(0.5);

        System.out.println(p);
    }
}

class Point2 {

    private double x;
    private double y;

    public Point2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point2() {
        this(0, 0);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point2 translate(double translateX, double translateY) {

        x += translateX;
        y += translateY;

        return this;
    }

    public Point2 scale(double factor) {

        x *= factor;
        y *= factor;

        return this;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
