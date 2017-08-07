package ch02.ex;

public class Ex05 {

    public static void main(String[] args) {

        Point p = new Point(3, 4).translate(1,3 ).scale(0.5);

        System.out.println(p);
    }
}

class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this(0, 0);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point translate(double translateX, double translateY) {

        return new Point(x + translateX, y + translateY);
    }

    public Point scale(double factor) {

        return new Point(x * factor, y * factor);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
