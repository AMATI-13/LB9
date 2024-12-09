package LB7;

public class BoxTest {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.addItem("Hello");
        stringBox.addItem("World");

        System.out.println("String Box: " + stringBox);
        System.out.println("Item at index 0: " + stringBox.getItem(0));

        Box<Integer> integerBox = new Box<>();
        integerBox.addItem(1);
        integerBox.addItem(2);

        System.out.println("Integer Box: " + integerBox);
        System.out.println("Item at index 1: " + integerBox.getItem(1));
    }
}
