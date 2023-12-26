package models;

public class Circle extends NamedShape {
    private double radius;

    public Circle() {
        super("Circle");
    }

    public Circle(double radius) {
        this();
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double length() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double perimeter() {
        return length();
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "{name = " + getName() +
                ", radius=" + radius +
                '}';
    }
}
