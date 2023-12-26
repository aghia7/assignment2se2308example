package models;

import helpers.Calculation;

public class Triangle extends NamedShape {
    private double a;
    private double b;
    private double c;

    public Triangle() {
        super("Triangle");
    }

    public Triangle(double a, double b, double c) {
        this();
        setA(a);
        setB(b);
        setC(c);
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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    @Override
    public double area() {
        return Calculation.calculateHeron(a, b, c);
    }

    @Override
    public String toString() {
        return "{name=" + getName() +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
