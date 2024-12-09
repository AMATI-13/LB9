package LB7;

import java.util.ArrayList;

public class Box<T> {
    private ArrayList<T> items;

    public Box() {
        this.items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public T getItem(int index) {
        return items.get(index);
    }

    public int size() {
        return items.size();
    }

    @Override
    public String toString() {
        return "Box{" + "items=" + items + '}';
    }
}
