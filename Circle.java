package LB7;

import java.lang.Cloneable;

public class Circle extends AbstractShape implements Comparable<Circle>, Cloneable, Drawable {
    private double radius;

    public Circle(double radius) throws InvalidShapeException {
        super("Circle");
        setRadius(radius);
    }

    public void setRadius(double radius) throws InvalidShapeException {
        if (radius < 0) {
            throw new InvalidShapeException("Радиус не может быть отрицательным.");
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public int compareTo(Circle other) {
        return Double.compare(this.calculateArea(), other.calculateArea());
    }

    @Override
    public void draw() {
        System.out.println("Рисуем круг с радиусом: " + radius);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
