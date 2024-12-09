package LB7;

public abstract class AbstractShape {
    private String name;

    public AbstractShape(String name) {
        this.name = name;
    }

    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " [Area: " + calculateArea() + ", Perimeter: " + calculatePerimeter() + "]";
    }
}
