package LB7;

import java.lang.Cloneable;

public class Square extends AbstractShape implements Comparable<Square>, Cloneable, Drawable {
    private double side;

    public Square(double side) throws InvalidShapeException {
        super("Square");
        setSide(side);
    }

    public void setSide(double side) throws InvalidShapeException {
        if (side < 0) {
            throw new InvalidShapeException("Сторона не может быть отрицательной.");
        }
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double calculateArea() {
        return Math.pow(side, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }

    @Override
    public int compareTo(Square other) {
        return Double.compare(this.calculateArea(), other.calculateArea());
    }

    @Override
    public void draw() {
        System.out.println("Рисуем квадрат с длиной стороны: " + side);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
