package LB7;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Calculator {
    private List<AbstractShape> shapes;

    private HashMap<String, AbstractShape> shapeMap;

    public Calculator() {
        shapes = new LinkedList<>();
        shapeMap = new HashMap<>();
    }

    public void addShape(AbstractShape shape) {
        shapes.add(shape);
        shapeMap.put(shape.getName(), shape);
    }

    public void removeShape(String name) {
        AbstractShape shape = shapeMap.remove(name);
        if (shape != null) {
            shapes.remove(shape);
        }
    }

    public void showAllShapes() {
        System.out.println("Все зарегистрированные фигуры:");
        for (AbstractShape shape : shapes) {
            System.out.println(shape);
        }
    }

    public AbstractShape getShape(String name) {
        return shapeMap.get(name);
    }
}
