package models;

public class Rectangle extends NamedShape {
    private double a;
    private double b;

    public Rectangle() {
        super("Rectangle");
    }

    public Rectangle(double a, double b) {
        this();
        setA(a);
        setB(b);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double perimeter() {
        return 2 * (a + b);
    }

    @Override
    public double area() {
        return a * b;
    }

    @Override
    public String toString() {
        return "{name=" + getName() +
                ", a=" + a +
                ", b=" + b +
                '}';
    }
}
